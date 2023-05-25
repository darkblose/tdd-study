package com.study.tdd.productorderservice.payment.adapter;

interface PaymentGateway {
    void excute(final int totalPrice, final String cardNumber);
}
