package com.sed.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GlobalEurekaClone3Application {

    public static void main(String[] args) {
        SpringApplication.run(GlobalEurekaClone3Application.class, args);
    }

}
