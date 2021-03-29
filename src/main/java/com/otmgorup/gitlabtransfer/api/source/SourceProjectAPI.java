package com.otmgorup.gitlabtransfer.api.source;

import com.otmgorup.gitlabtransfer.domain.Project;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface SourceProjectAPI {

    @GET("projects")
    Call<List<Project>> getProjects(@Query("per_page") Integer perPage);

    @GET("projects/{id}")
    Call<Project> getProject( @Path("id")Integer id);



}
