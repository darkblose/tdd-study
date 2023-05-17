package com.study.tdd.productorderservice.payment;

import com.study.tdd.productorderservice.order.Order;
import com.study.tdd.productorderservice.product.DiscountPolicy;
import com.study.tdd.productorderservice.product.Product;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class PaymentAdapter implements PaymentPort {
    private final PaymentGateway paymentGateway;
    private final PaymentRepository paymentRepository;

    @Override
    public Order getOrder(Long orderId) {
        return new Order(new Product("상품1", 1000, DiscountPolicy.NONE), 2);
    }

    @Override
    public void pay(final int totalPrice, final String cardNumber) {
        paymentGateway.excute(totalPrice, cardNumber);
    }

    @Override
    public void save(Payment payment) {
        paymentRepository.save(payment);
    }
}
