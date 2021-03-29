package com.otmgorup.gitlabtransfer.api.source;

import com.otmgorup.gitlabtransfer.domain.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface SourceUserAPI {
    @GET("users")
    Call<List<User>> getUsers(@Query("per_page") Integer perPage);

    @GET("users/${id}")
    Call<List<User>> getUser( @Path("id") Integer id);

    @POST("users")
    Call<List<User>> createUser( @Body User user);

}
