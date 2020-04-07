package com.imooc.springcloud.service;

import com.imooc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author CBeann
 * @create 2020-04-07 23:35
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
