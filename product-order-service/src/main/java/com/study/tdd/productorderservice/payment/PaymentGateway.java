package com.study.tdd.productorderservice.payment;

interface PaymentGateway {
    void excute(final int totalPrice, final String cardNumber);
}
