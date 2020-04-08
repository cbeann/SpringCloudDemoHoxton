package com.imooc.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author CBeann
 * @create 2020-04-08 19:13
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return "springCloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}