package com.otmgorup.gitlabtransfer.api.source;

import com.otmgorup.gitlabtransfer.domain.Group;
import com.otmgorup.gitlabtransfer.api.dto.GroupListDTO;
import com.otmgorup.gitlabtransfer.api.dto.GroupMemberListDTO;
import com.otmgorup.gitlabtransfer.domain.Project;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface SourceGroupAPI {

    @GET("groups")
    Call<List<GroupListDTO>> getGroups();

    @GET("groups/{id}/members")
    Call<List<GroupMemberListDTO>> getGroupMembers(@Path("id") Integer id, @Query("per_page") Integer perPage);

    @GET("groups/{id}/projects")
    Call<List<Project>> getGroupProjects(@Path("id") Integer id, @Query("per_page") Integer perPage);

    @GET("groups/${groupId}")
    Call<Group> getGroup( @Path("groupId") Integer groupId);

    @POST("groups")
    Call<Group> createGroup( @Body Group group);
}
