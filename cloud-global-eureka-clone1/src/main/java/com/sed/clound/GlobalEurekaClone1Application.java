package com.sed.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GlobalEurekaClone1Application {

    public static void main(String[] args) {
        SpringApplication.run(GlobalEurekaClone1Application.class, args);
    }

}
