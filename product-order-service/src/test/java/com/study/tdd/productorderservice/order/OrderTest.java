package com.study.tdd.productorderservice.order;

import com.study.tdd.productorderservice.order.domain.Order;
import com.study.tdd.productorderservice.product.domain.DiscountPolicy;
import com.study.tdd.productorderservice.product.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderTest {
    @Test
    public void 최종가격_할인없음() throws Exception {
        // given
        final Order order = new Order(new Product("상품명", 1000, DiscountPolicy.NONE), 2);
        // when
        final int totalPrice = order.getTotalPrice();
        // then
        assertThat(totalPrice).isEqualTo(2000);
    }

    @Test
    public void 최종가격_1000원_할인() throws Exception {
        // given
        final Order order = new Order(new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2);
        // when
        final int totalPrice = order.getTotalPrice();
        // then
        assertThat(totalPrice).isEqualTo(2000);
    }
}