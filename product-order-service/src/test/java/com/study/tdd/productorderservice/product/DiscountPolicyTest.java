package com.study.tdd.productorderservice.product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DiscountPolicyTest {
    @Test
    public void 할인없음() throws Exception {
        // given
        final int price = 1000;
        final int discountedPrice = DiscountPolicy.NONE.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(price);
    }

    @Test
    public void 천원이상_할인() throws Exception {
        // given
        final int price = 2000;
        final int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(1000);
    }

    @Test
    public void 천원미만_할인() throws Exception {
        // given
        final int price = 500;
        final int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(0);
    }
}