package com.study.tdd.productorderservice.payment;

import com.study.tdd.productorderservice.order.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class PaymentSerivce {
    private final PaymentPort paymentPort;

    public void payment(final PaymentRequest request) {
        final Order order = paymentPort.getOrder(request.orderId());

        final Payment payment = new Payment(order, request.cardNumber());

        paymentPort.pay(payment.getTotalPrice(), payment.getCardNumber());
        paymentPort.save(payment);
    }
}
