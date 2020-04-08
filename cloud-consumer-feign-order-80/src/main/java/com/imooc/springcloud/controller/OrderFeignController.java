package com.imooc.springcloud.controller;

import com.imooc.springcloud.entities.CommonResult;
import com.imooc.springcloud.entities.Payment;
import com.imooc.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CBeann
 * @create 2020-04-08 22:26
 */
@RestController
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        String s = paymentFeignService.paymentFeignTimeout();
        return s;
    }
}
