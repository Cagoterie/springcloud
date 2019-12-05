package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@SpringBootApplication
@EnableEurekaServer
public class Eureka02Application {
    public static void main(String []args){
        SpringApplication.run(Eureka02Application.class);
    }
}
