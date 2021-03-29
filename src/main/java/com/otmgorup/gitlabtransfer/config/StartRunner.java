package com.otmgorup.gitlabtransfer.config;

import com.google.common.cache.Cache;
import com.otmgorup.gitlabtransfer.api.dto.GroupListDTO;
import com.otmgorup.gitlabtransfer.api.dto.GroupMemberListDTO;
import com.otmgorup.gitlabtransfer.api.source.SourceGroupAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceProjectAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceUserAPI;
import com.otmgorup.gitlabtransfer.cache.domain.GroupCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.GroupMemberCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.ProjectCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.UserCacheDTO;
import com.otmgorup.gitlabtransfer.domain.Project;
import com.otmgorup.gitlabtransfer.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Slf4j
public class StartRunner implements ApplicationRunner {

    @Autowired
    private SourceGroupAPI sourceGroupAPI;

    @Autowired
    private SourceProjectAPI sourceProjectAPI;

    @Autowired
    private SourceUserAPI sourceUserAPI;

    @Autowired
    private Cache<String, GroupCacheDTO> groupCache;

    @Autowired
    private Cache<String, UserCacheDTO> userCache;

    @Autowired
    private Cache<String, ProjectCacheDTO> projectCache;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("load groups start:");
        final List<GroupListDTO> groups = sourceGroupAPI.getGroups().execute().body();
        Assert.notNull(groups, "group cannot be null");
        for (GroupListDTO group : groups) {
            final GroupCacheDTO cacheDTO = new GroupCacheDTO();
            BeanUtils.copyProperties(group, cacheDTO);
            groupCache.put(group.getName(), cacheDTO);
        }
        log.info("load groups successfully");

        log.info("load users start");
        List<User> users = sourceUserAPI.getUsers(1000).execute().body();
        Assert.notNull(users, "users cannot be null");
        users = users.stream().filter(e -> "active".equals(e.getState())).filter(e -> !"Ghost User".equals(e.getName())).collect(Collectors.toList());
        for (User user : users) {
            final UserCacheDTO dto = new UserCacheDTO();
            BeanUtils.copyProperties(user, dto);
            userCache.put(user.getName(), dto);
        }
        log.info("load users successfully.");

        log.info("load group members start");
        for (Map.Entry<String, GroupCacheDTO> entry : groupCache.asMap().entrySet()) {
            final GroupCacheDTO group = entry.getValue();
            final Integer groupId = group.getId();
            final List<GroupMemberListDTO> members = sourceGroupAPI.getGroupMembers(groupId, 1000).execute().body();
            Assert.notNull(members, "get group members failed.");
            final List<GroupMemberCacheDTO> groupMembers = members.stream().filter(e -> e.getState().equals("active")).map(e -> {
                final GroupMemberCacheDTO dto = new GroupMemberCacheDTO();
                BeanUtils.copyProperties(e, dto);
                return dto;
            }).collect(Collectors.toList());
            group.setMembers(groupMembers);
        }
        log.info("load group members successfully.");

        log.info("load  projects start");
        final List<Project> projects = sourceProjectAPI.getProjects(1000).execute().body();
        Assert.notNull(projects, "get projects failed");
        for (Project project : projects) {
            final ProjectCacheDTO dto = new ProjectCacheDTO();
            BeanUtils.copyProperties(project, dto);

            ProjectCacheDTO.NamespaceDTO namespace = new ProjectCacheDTO.NamespaceDTO();
            BeanUtils.copyProperties(project.getNamespace(), namespace);
            dto.setNamespace(namespace);
            projectCache.put(project.getName(), dto);
        }
        log.info("load  projects successfully.");

    }

}