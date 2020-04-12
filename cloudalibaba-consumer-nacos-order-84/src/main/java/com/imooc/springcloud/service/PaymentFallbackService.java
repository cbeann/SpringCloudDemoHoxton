package com.imooc.springcloud.service;

import com.imooc.springcloud.entities.CommonResult;
import com.imooc.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author CBeann
 * @create 2020-04-12 13:31
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}