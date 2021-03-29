package com.otmgorup.gitlabtransfer.interceptor;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class TokenInterceptor implements Interceptor {

    private final String token;

    public TokenInterceptor(String token) {
        this.token = token;
    }

    @Override
    public Response intercept( Chain chain) throws IOException {
        final Request request = chain.request();
        final Request newRequest;
        newRequest = request.newBuilder()
                .addHeader("PRIVATE-TOKEN", token)
                .build();
        return chain.proceed(newRequest);
    }
}
