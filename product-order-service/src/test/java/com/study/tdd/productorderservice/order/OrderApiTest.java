package com.study.tdd.productorderservice.order;

import com.study.tdd.productorderservice.ApiTest;
import com.study.tdd.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderApiTest extends ApiTest {

    @Test
    public void 상품주문() throws Exception {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final var request = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
    }

}














