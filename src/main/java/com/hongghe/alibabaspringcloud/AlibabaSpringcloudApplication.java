package com.hongghe.alibabaspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaSpringcloudApplication.class, args);
    }

}
