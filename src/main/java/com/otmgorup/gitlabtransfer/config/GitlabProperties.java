package com.otmgorup.gitlabtransfer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "gitlab")
@Component
@Data
public class GitlabProperties {

    private String sourceUrl;

    private String sourceToken;

    private String targetUrl;

    private String targetToken;

    private String sourceUsername;

    private String sourcePassword;

    private String defaultPassword;

}
