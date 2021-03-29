package com.otmgorup.gitlabtransfer.api.target;

import com.otmgorup.gitlabtransfer.api.dto.AddProjectDTO;
import com.otmgorup.gitlabtransfer.domain.Project;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface TargetProjectAPI {

    @GET("projects")
    Call<List<Project>> getProjects(@Query("per_page") Integer perPage);

    @GET("projects/{id}")
    Call<Project> getProject( @Path("id")Integer id);

    @DELETE("projects/{id}")
    Call<Object> removeProject( @Path("id")Integer id);


    @POST("projects")
    Call<AddProjectDTO> createProject(@Body AddProjectDTO project);

}
