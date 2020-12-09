package com.aviccii.springcloud.service.impl;

import com.aviccii.springcloud.dao.PaymentDao;
import com.aviccii.springcloud.entities.Payment;
import com.aviccii.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author aviccii 2020/12/9
 * @Discrimination
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource //等同autowired
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
