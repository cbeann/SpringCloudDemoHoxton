package com.imooc.springcloud.service;

import com.imooc.springcloud.entities.CommonResult;
import com.imooc.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author CBeann
 * @create 2020-04-12 13:31
 */
@FeignClient(value = "cloudalibaba-provider-payment",fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> PaymentSQL(@PathVariable("id") Long id);
}
