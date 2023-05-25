package com.study.tdd.productorderservice.payment;

import com.study.tdd.productorderservice.ApiTest;
import com.study.tdd.productorderservice.order.OrderSteps;
import com.study.tdd.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class PaymentApiTest extends ApiTest {
    @Test
    public void 상품주문() throws Exception {
        ProductSteps.상품등록요청((ProductSteps.상품등록요청_생성()));
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());
        final var request = PaymentSteps.주문결제요청_생성();

        final var response = PaymentSteps.주문결제요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
    }

}
