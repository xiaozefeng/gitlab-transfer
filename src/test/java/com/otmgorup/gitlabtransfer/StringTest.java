package com.otmgorup.gitlabtransfer;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class StringTest {

    @Test
    public void testURL() throws URISyntaxException {
        String url = "http://139.9.33.210/otm/otmgroup-merchant-external-ability.git";
        URI uri = new URI(url);
        final String scheme = uri.getScheme();
        System.out.println(scheme);
        final String rawPath = uri.getRawPath();
        System.out.println(rawPath);
        final String host = uri.getHost();
        System.out.println(host);

        System.out.printf("%s://%s%s%s%s%n", scheme, "mickey.xiao", "1qaz@WSX", host, rawPath);
    }
}

