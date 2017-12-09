package com.example.devopsinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author zhang
 */
@SpringBootApplication
public class DevOpsInActionApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(DevOpsInActionApplication.class, args);
        File file = ResourceUtils.getFile("classpath:sh/deploy.sh");
        Runtime.getRuntime().exec(file.getPath()).waitFor();
    }
}
