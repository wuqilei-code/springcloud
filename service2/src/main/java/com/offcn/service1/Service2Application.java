package com.offcn.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Service2Application {

    public static void main(String[] args) {

        SpringApplication.run(Service2Application.class, args);
    }

}
