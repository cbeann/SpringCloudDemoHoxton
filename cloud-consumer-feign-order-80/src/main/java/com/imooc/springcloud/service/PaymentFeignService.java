package com.imooc.springcloud.service;

import com.imooc.springcloud.entities.CommonResult;
import com.imooc.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CBeann
 * @create 2020-04-08 22:11
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
