package com.otmgorup.gitlabtransfer.api.target;

import com.otmgorup.gitlabtransfer.api.dto.AddUserToGroupDTO;
import com.otmgorup.gitlabtransfer.domain.Group;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TargetGroupAPI {

    @GET("groups")
    Call<List<Group>> getGroups();

    @GET("groups/${groupId}")
    Call<Group> getGroup(@Path("groupId") Integer groupId);

    @POST("groups")
    Call<Group> createGroup(@Body Group group);

    @DELETE("groups/{id}")
    Call<Object> removeGroup(@Path("id") Integer groupId);

    @POST("groups/{id}/members")
    Call<Object> addUserIntoGroup(@Path("id") Integer groupId, @Body AddUserToGroupDTO dto);


}
