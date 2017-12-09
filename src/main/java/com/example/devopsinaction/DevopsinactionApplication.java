package com.example.devopsinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DevopsinactionApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(DevopsinactionApplication.class, args);
        Runtime.getRuntime().exec("sh/deploy.sh").waitFor();
    }
}
