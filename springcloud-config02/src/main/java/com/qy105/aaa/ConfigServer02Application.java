package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/4
 */

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServer02Application {
    public static void main(String []args){
        SpringApplication.run(ConfigServer02Application.class);
    }
}
