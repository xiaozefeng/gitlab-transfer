package com.otmgorup.gitlabtransfer.api.target;

import com.otmgorup.gitlabtransfer.domain.User;
import com.otmgorup.gitlabtransfer.api.dto.UserCreateDTO;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TargetUserAPI {
    @GET("users")
    Call<List<User>> getUsers();

    @GET("users/{id}")
    Call<User> getUser( @Path("id") Integer id);

    @POST("users")
    Call<UserCreateDTO> createUser(@Body UserCreateDTO user);

    @DELETE("users/{id}")
    Call<Object> deleteUser(@Path("id") Integer id);

    @POST("users/{id}/approve")
    Call<Object> approveUser(@Path("id") Integer id);




}
