package com.zhifa.jenkinshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsHelloApplication {

    /**
     * docker build -t runoob/ubuntu:v1 .
     *
     * sudo gpasswd -a jenkins docker
     * sudo service jenkins restart
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(JenkinsHelloApplication.class, args);
    }

}
