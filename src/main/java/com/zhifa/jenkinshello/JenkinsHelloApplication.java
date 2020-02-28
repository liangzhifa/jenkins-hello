package com.zhifa.jenkinshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsHelloApplication {

    /**
     * docker build -t runoob/ubuntu:v1 .
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(JenkinsHelloApplication.class, args);
    }

}
