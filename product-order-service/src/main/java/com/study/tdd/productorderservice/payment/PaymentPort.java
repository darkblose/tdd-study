package com.study.tdd.productorderservice.payment;

import com.study.tdd.productorderservice.order.Order;

interface PaymentPort {

    Order getOrder(Long orderId);


    void pay(int totalPrice, String cardNumber);

    void save(final Payment payment);
}
