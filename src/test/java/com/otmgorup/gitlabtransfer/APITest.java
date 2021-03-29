package com.otmgorup.gitlabtransfer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.otmgorup.gitlabtransfer.interceptor.TokenInterceptor;
import com.otmgorup.gitlabtransfer.api.target.TargetGroupAPI;
import com.otmgorup.gitlabtransfer.domain.Group;
import com.otmgorup.gitlabtransfer.api.dto.GroupListDTO;
import com.otmgorup.gitlabtransfer.api.dto.ProjectListDTO;
import com.otmgorup.gitlabtransfer.api.dto.UserListDTO;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;


public class APITest {

    private String sourceUrl = "http://139.9.33.210/api/v4/";
    private String targetUrl = "http://gitlab.otmgroup.cn/api/v4/";

    // private String targetToken ="wqzeyya4xzEa9GYeYWBq";
    // root token
    private String targetToken ="MTkyuzs2H1s9pg3PGfPx";

    private Interceptor createLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }

    OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(createLoggingInterceptor())
            .addInterceptor(new TokenInterceptor(targetToken
            )).build();

    Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    private Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(targetUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();


    @Test
    public void testGetGroups() {
        final Request request = new Request.Builder()
                .url(sourceUrl + "groups")
                .addHeader("PRIVATE-TOKEN", "w7hf-xzGxaa_bayPMqdF")
                .build();
        try (final Response response = client.newCall(request).execute()) {
            final String res = response.body().string();
            System.out.println(res);
            final Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            final List<GroupListDTO> groups = gson.fromJson(res, new TypeToken<List<GroupListDTO>>() {
            }.getType());
            groups.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testGetUsers() {
        final Request request = new Request.Builder()
                .url(sourceUrl + "users")
                .addHeader("PRIVATE-TOKEN", "w7hf-xzGxaa_bayPMqdF")
                .build();
        try (final Response response = client.newCall(request).execute()) {
            final String res = response.body().string();
            // System.out.println(res);
            final Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            final List<UserListDTO> users = gson.fromJson(res, new TypeToken<List<UserListDTO>>() {
            }.getType());
            users.stream().filter(e -> e.getState().equals("active")).forEach(System.out::println);
            System.out.println(users.stream().filter(e -> e.getState().equals("active")).count());
            // users.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetProjects() {
        final Request request = new Request.Builder()
                .url(sourceUrl + "projects")
                .addHeader("PRIVATE-TOKEN", "w7hf-xzGxaa_bayPMqdF")
                .build();
        try (final Response response = client.newCall(request).execute()) {
            final String res = response.body().string();
            // System.out.println(res);
            final Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
            final List<ProjectListDTO> projects = gson.fromJson(res, new TypeToken<List<ProjectListDTO>>() {
            }.getType());
            // projects.stream().filter(e -> e.getState().equals("active")).forEach(System.out::println);
            System.out.println(projects.stream().count());
            projects.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateGroup() throws IOException {
        final TargetGroupAPI targetGroupAPI = retrofit.create(TargetGroupAPI.class);
        final Group group = new Group();
        group.setName("hello1");
        group.setPath("hello1");
        group.setVisibility("private");
        final Group res = targetGroupAPI.createGroup(group).execute().body();
        System.out.println(res);
    }


}
