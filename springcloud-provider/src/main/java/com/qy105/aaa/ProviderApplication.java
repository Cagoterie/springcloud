package com.qy105.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qy105小仙女
 * @version 1.0
 * @Date 2019/12/3
 */

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {
    public static void main(String []args){
        SpringApplication.run(ProviderApplication.class,args);
    }
}
