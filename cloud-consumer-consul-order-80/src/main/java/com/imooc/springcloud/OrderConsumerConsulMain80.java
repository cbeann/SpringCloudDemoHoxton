package com.imooc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CBeann
 * @create 2020-04-08 19:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerConsulMain80.class, args);
    }
}
