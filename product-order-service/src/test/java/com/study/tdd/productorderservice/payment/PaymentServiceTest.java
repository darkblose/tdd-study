package com.study.tdd.productorderservice.payment;

import com.study.tdd.productorderservice.order.OrderService;
import com.study.tdd.productorderservice.order.OrderSteps;
import com.study.tdd.productorderservice.product.ProductService;
import com.study.tdd.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentServiceTest {
    @Autowired
    private PaymentSerivce paymentService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    @Test
    public void 상품주문() throws Exception {
        productService.addProduct(ProductSteps.상품등록요청_생성());
        orderService.createOrder(OrderSteps.상품주문요청_생성());
        final PaymentRequest request = PaymentSteps.주문결제요청_생성();

        paymentService.payment(request);
    }
}
