package com.imooc.springcloud.service.impl;

import com.imooc.springcloud.dao.PaymentDao;
import com.imooc.springcloud.entities.Payment;
import com.imooc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author CBeann
 * @create 2020-04-07 23:36
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
