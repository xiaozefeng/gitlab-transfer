package com.otmgorup.gitlabtransfer;

import com.google.common.cache.Cache;
import com.otmgorup.gitlabtransfer.api.dto.AddProjectDTO;
import com.otmgorup.gitlabtransfer.api.dto.AddUserToGroupDTO;
import com.otmgorup.gitlabtransfer.api.dto.UserCreateDTO;
import com.otmgorup.gitlabtransfer.api.target.TargetGroupAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetProjectAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetUserAPI;
import com.otmgorup.gitlabtransfer.cache.domain.GroupCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.GroupMemberCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.ProjectCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.UserCacheDTO;
import com.otmgorup.gitlabtransfer.config.GitlabProperties;
import com.otmgorup.gitlabtransfer.domain.Group;
import com.otmgorup.gitlabtransfer.util.URLUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Response;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@SpringBootApplication
@RestController
@RequestMapping
@Slf4j
public class GitlabTransferApplication {

    @Autowired
    private Cache<String, GroupCacheDTO> groupCache;

    @Autowired
    private Cache<String, UserCacheDTO> userCache;

    @Autowired
    private Cache<String, ProjectCacheDTO> projectCache;

    public static void main(String[] args) {
        SpringApplication.run(GitlabTransferApplication.class, args);
    }


    @GetMapping("entrance")
    public String entrance() throws Exception {
        log.warn("创建 groups:");
        for (Map.Entry<String, GroupCacheDTO> entry : groupCache.asMap().entrySet()) {
            final GroupCacheDTO group = entry.getValue();
            final Group g = new Group();
            g.setName(group.getName());
            g.setPath(group.getPath());
            g.setVisibility(group.getVisibility());
            final Group createResult = targetGroupAPI.createGroup(g).execute().body();
            Assert.notNull(createResult, "create group failed");
            group.setNewGroupId(createResult.getId());
        }
        log.warn("创建 groups successfully.");


        log.info("创建 users:");
        for (Map.Entry<String, UserCacheDTO> entry : userCache.asMap().entrySet()) {
            final UserCacheDTO user = entry.getValue();
            final UserCreateDTO dto = new UserCreateDTO();
            dto.setAdmin(user.getIsAdmin());
            dto.setCan_create_group(user.getCanCreateGroup());
            dto.setEmail(user.getEmail());
            dto.setName(user.getName());
            dto.setPassword(gitlabProperties.getDefaultPassword());
            dto.setUsername(user.getUsername());
            dto.setSkip_confirmation(true);
            final UserCreateDTO createResult = targetUserAPI.createUser(dto).execute().body();
            Assert.notNull(createResult, "crate user failed.");
            user.setNewUserId(createResult.getId());
        }
        log.info("创建 users successfully.");


        log.warn("将user加入group");
        for (Map.Entry<String, GroupCacheDTO> entry : groupCache.asMap().entrySet()) {
            final GroupCacheDTO group = entry.getValue();
            final List<GroupMemberCacheDTO> members = group.getMembers();
            for (GroupMemberCacheDTO member : members) {
                final AddUserToGroupDTO dto = new AddUserToGroupDTO();
                dto.setAccess_level(member.getAccessLevel());
                final Integer newUserId = Objects.requireNonNull(userCache.getIfPresent(member.getName())).getNewUserId();
                dto.setUser_id(newUserId);
                final Response<Object> execute = targetGroupAPI.addUserIntoGroup(group.getNewGroupId(), dto).execute();
                if (!execute.isSuccessful()){
                    log.warn("add user into group failed reason:{}", execute.message());
                }
            }
        }


        log.warn("创建projects");
        for (Map.Entry<String, ProjectCacheDTO> entry : projectCache.asMap().entrySet()) {
            final ProjectCacheDTO project = entry.getValue();
            final AddProjectDTO param = new AddProjectDTO();
            param.setName(project.getName());
            param.setPath(project.getPath());
            param.setImport_url(URLUtil.addUsernameAndPassword(project.getHttpUrlToRepo(), gitlabProperties.getSourceUsername(), gitlabProperties.getSourcePassword()));
            // get new group id
            log.info("project info:{}", project);
            log.info("param info:{}", param);
            log.info("group cache:{}",groupCache);
            final GroupCacheDTO group = groupCache.getIfPresent(project.getNamespace().getName());
            Assert.notNull(group, "get group from cache failed. ");
            param.setNamespace_id(group.getNewGroupId());
            final AddProjectDTO createResult = targetProjectAPI.createProject(param).execute().body();
            Assert.notNull(createResult, "create project failed.");
        }
        return "ok";
    }

    @Autowired
    private TargetGroupAPI targetGroupAPI;

    @Autowired
    private TargetUserAPI targetUserAPI;

    @Autowired
    private TargetProjectAPI targetProjectAPI;

    @Autowired
    private GitlabProperties gitlabProperties;
}
