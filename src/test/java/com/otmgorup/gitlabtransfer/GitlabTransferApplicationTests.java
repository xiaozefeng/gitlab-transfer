package com.otmgorup.gitlabtransfer;

import com.google.gson.Gson;
import com.otmgorup.gitlabtransfer.api.source.SourceGroupAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceProjectAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceUserAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetGroupAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetProjectAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetUserAPI;
import com.otmgorup.gitlabtransfer.api.dto.AddProjectDTO;
import com.otmgorup.gitlabtransfer.domain.Group;
import com.otmgorup.gitlabtransfer.api.dto.GroupMemberListDTO;
import com.otmgorup.gitlabtransfer.domain.Project;
import com.otmgorup.gitlabtransfer.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class GitlabTransferApplicationTests {

    @Autowired
    private TargetUserAPI targetUserAPI;


    @Autowired
    private SourceGroupAPI sourceGroupAPI;

    @Autowired
    private Gson gson;

    @Test
    public void testGetGroupMembers() throws IOException {
        final List<GroupMemberListDTO> members = sourceGroupAPI.getGroupMembers(69, 1000).execute().body();
        System.out.println(gson.toJson(members));

    }

    @Autowired
    private SourceProjectAPI sourceProjectAPI;


    @Autowired
    private TargetProjectAPI targetProjectAPI;

    @Test
    public void testCreateProject() throws IOException {
        final AddProjectDTO project = new AddProjectDTO();
        project.setName("pms-hotel-data-sync");
        project.setPath("pms-hotel-data-sync");
        project.setImport_url("http://mickey.xiao:1qaz@WSX@139.9.33.210/otm/pms-hotel-data-sync.git");
        project.setNamespace_id(40);
        final AddProjectDTO createResult = targetProjectAPI.createProject(project).execute().body();
        System.out.println(createResult);
    }

    @Test
    public void testGetProject() throws IOException {
        final Project project = sourceProjectAPI.getProject(52).execute().body();
        System.out.println(gson.toJson(project));
    }

    @Test
    public void testGetProjects() throws IOException {
        final List<Project> projects = sourceProjectAPI.getProjects(1000).execute().body();
        // System.out.println(gson.toJson(projects));
        projects.forEach(System.out::println);
    }

    @Autowired
    private TargetGroupAPI targetGroupAPI;

    @Test
    public void clean() throws Exception {
        final List<Group> groups = targetGroupAPI.getGroups().execute().body();
        Assert.notNull(groups, "groups cannot  be null");
        for (Group group : groups) {
            targetGroupAPI.removeGroup(group.getId()).execute();
        }

        final List<User> users = targetUserAPI.getUsers().execute().body();
        Assert.notNull(users, "get users failed.");
        for (User user : users) {
            if (user.getName().equals("米奇") || user.getName().equals("Administrator")) {
                continue;
            }
            targetUserAPI.deleteUser(user.getId()).execute();
        }
        final List<Project> projects = targetProjectAPI.getProjects(1000).execute().body();
        Assert.notNull(projects, "get projects failed.");
        for (Project project : projects) {
            targetProjectAPI.removeProject(project.getId());
        }
    }

    @Autowired
    private SourceUserAPI sourceUserAPI;

    @Test
    public void testGetUsers() throws IOException {
        List<User> users = sourceUserAPI.getUsers(1000).execute().body();
        // System.out.println(gson.toJson(users));
        users = users.stream().filter(e -> e.getState().equals("active")).collect(Collectors.toList());
        users.forEach(System.out::println);
    }

    @Test
    public void testGetUser() throws IOException {
        final User user = targetUserAPI.getUser(79).execute().body();
        System.out.println(user);
    }


    @Test
    public void testApproveUser() throws IOException {
        targetUserAPI.approveUser(174).execute();
    }


}
