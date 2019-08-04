package com.it.vx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.http.EurekaApplications;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wangbs
 * @version 1.0
 * @date 2019/8/3 19:50
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurakeApplication.class);
    }
}
