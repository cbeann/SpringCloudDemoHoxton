package com.imooc.springcloud.dao;

import com.imooc.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author CBeann
 * @create 2020-04-07 23:27
 */
@Mapper
public interface PaymentDao {


    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
