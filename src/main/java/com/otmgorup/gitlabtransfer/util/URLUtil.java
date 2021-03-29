package com.otmgorup.gitlabtransfer.util;


import java.net.URI;
import java.net.URISyntaxException;

public class URLUtil {

    private URLUtil(){}

    /**
     * 带用户名密码的 git url
     * @param url
     * @param username
     * @param password
     * @return
     * @throws URISyntaxException
     */
    public static String addUsernameAndPassword(String url, String username, String password) throws URISyntaxException {
        URI uri = new URI(url);
        final String scheme = uri.getScheme();
        final String rawPath = uri.getRawPath();
        final String host = uri.getHost();
        return String.format("%s://%s:%s@%s%s", scheme, username, password, host, rawPath);
    }
}
