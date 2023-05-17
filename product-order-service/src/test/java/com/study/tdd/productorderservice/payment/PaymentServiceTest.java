package com.study.tdd.productorderservice.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {
    private PaymentSerivce paymentService;

    @BeforeEach
    void setUp() {
        final PaymentGateway paymentGateway = new ConsolePaymentGateway();
        final PaymentRepository paymentRepository = new PaymentRepository();
        final PaymentPort paymentPort = new PaymentAdapter(paymentGateway, paymentRepository);
        paymentService = new PaymentSerivce(paymentPort);
    }

    @Test
    public void 상품주문() throws Exception {
        final PaymentRequest request = PaymentSteps.주문결제요청_생성();

        paymentService.payment(request);
    }
}
