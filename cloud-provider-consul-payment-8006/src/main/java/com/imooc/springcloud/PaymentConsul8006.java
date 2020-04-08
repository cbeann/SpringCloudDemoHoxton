package com.imooc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author CBeann
 * @create 2020-04-08 19:12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsul8006 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentConsul8006.class, args);
    }


}
