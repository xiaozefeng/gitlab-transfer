package com.otmgorup.gitlabtransfer.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.otmgorup.gitlabtransfer.cache.domain.GroupCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.ProjectCacheDTO;
import com.otmgorup.gitlabtransfer.cache.domain.UserCacheDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfig {

    @Bean
    public Cache<String, GroupCacheDTO> createGroupCache() {
        return CacheBuilder.newBuilder().build();
    }

    @Bean
    public Cache<String, UserCacheDTO> createUserCache() {
        return CacheBuilder.newBuilder().build();
    }

    @Bean
    public Cache<String, ProjectCacheDTO> createProjectCache() {
        return CacheBuilder.newBuilder().build();
    }


}
