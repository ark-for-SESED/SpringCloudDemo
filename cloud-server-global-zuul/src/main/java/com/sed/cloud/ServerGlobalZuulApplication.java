package com.sed.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulServer
public class ServerGlobalZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerGlobalZuulApplication.class, args);
    }

}