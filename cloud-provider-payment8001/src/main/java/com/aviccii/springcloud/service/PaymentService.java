package com.aviccii.springcloud.service;

import com.aviccii.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author aviccii 2020/12/9
 * @Discrimination
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);

}
