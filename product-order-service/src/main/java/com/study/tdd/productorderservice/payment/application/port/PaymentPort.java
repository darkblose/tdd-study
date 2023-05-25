package com.study.tdd.productorderservice.payment.application.port;

import com.study.tdd.productorderservice.order.domain.Order;
import com.study.tdd.productorderservice.payment.domain.Payment;

interface PaymentPort {

    Order getOrder(Long orderId);


    void pay(int totalPrice, String cardNumber);

    void save(final Payment payment);
}
