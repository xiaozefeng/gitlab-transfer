package com.otmgorup.gitlabtransfer.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.otmgorup.gitlabtransfer.api.source.SourceGroupAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceProjectAPI;
import com.otmgorup.gitlabtransfer.api.source.SourceUserAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetGroupAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetProjectAPI;
import com.otmgorup.gitlabtransfer.api.target.TargetUserAPI;
import com.otmgorup.gitlabtransfer.interceptor.TokenInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Configuration
public class RetrofitConfig {

    @Resource
    private GitlabProperties gitlabProperties;

    @Resource
    private OKHTTPConfigProperties okhttpConfigProperties;

    @Bean
    public Gson createGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    @Bean
    public OkHttpClient createOkHttpClient() {
        Long readTimeout = okhttpConfigProperties.getReadTimeout();
        Long connectTimeout = okhttpConfigProperties.getConnectionTimeout();
        return new OkHttpClient.Builder()
                .readTimeout(readTimeout == null ? 30 : readTimeout, TimeUnit.MILLISECONDS)
                .connectTimeout(connectTimeout == null ? 30 : connectTimeout, TimeUnit.MILLISECONDS)
                .build();
    }


    private Interceptor createLoggingInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        final HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.valueOf(okhttpConfigProperties.getLogLevel());
        interceptor.setLevel(level);
        return interceptor;
    }

    @Bean("sourceRetrofit")
    public Retrofit createSourceRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();


        return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(gitlabProperties.getSourceUrl())
                .client(new OkHttpClient.Builder()
                        .addInterceptor(createLoggingInterceptor())
                        .addInterceptor(new TokenInterceptor(gitlabProperties.getSourceToken())
                        ).build())
                .build();
    }

    @Bean("targetRetrofit")
    public Retrofit createTargetRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(gitlabProperties.getTargetUrl())
                .client(new OkHttpClient.Builder()
                        .addInterceptor(createLoggingInterceptor())
                        .addInterceptor(new TokenInterceptor(gitlabProperties.getTargetToken())).build())
                .build();
    }


    @Bean
    public SourceGroupAPI createSourceGroupAPI(@Autowired @Qualifier("sourceRetrofit") Retrofit retrofit) {
        return retrofit.create(SourceGroupAPI.class);
    }

    @Bean
    public TargetGroupAPI createTargetGroupAPI(@Autowired @Qualifier("targetRetrofit") Retrofit retrofit) {
        return retrofit.create(TargetGroupAPI.class);
    }

    @Bean
    public SourceProjectAPI createSourceProjectAPI(@Autowired @Qualifier("sourceRetrofit") Retrofit retrofit) {
        return retrofit.create(SourceProjectAPI.class);
    }

    @Bean
    public TargetProjectAPI createTargetProjectAPI(@Autowired @Qualifier("targetRetrofit") Retrofit retrofit) {
        return retrofit.create(TargetProjectAPI.class);
    }

    @Bean
    public SourceUserAPI createSourceUserAPI(@Autowired @Qualifier("sourceRetrofit") Retrofit retrofit) {
        return retrofit.create(SourceUserAPI.class);
    }

    @Bean
    public TargetUserAPI createTargetUserAPI(@Autowired @Qualifier("targetRetrofit") Retrofit retrofit) {
        return retrofit.create(TargetUserAPI.class);
    }


}
