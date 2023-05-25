package com.study.tdd.productorderservice.product;

import com.study.tdd.productorderservice.product.domain.DiscountPolicy;
import com.study.tdd.productorderservice.product.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {
    @Test
    public void update() throws Exception {
        // given
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);
        // when
        product.update("상품 수정", 2000, DiscountPolicy.NONE);
        // then
        assertThat(product.getName()).isEqualTo("상품 수정");
        assertThat(product.getPrice()).isEqualTo(2000);
    }

    @Test
    public void none_discounted_product() throws Exception {
        // given
        final Product product = new Product("상품명", 1000, DiscountPolicy.NONE);
        // when
        final int discountedPrice = product.getDiscountedPrice();
        // then
        assertThat(discountedPrice).isEqualTo(1000);
    }

    @Test
    public void fixed_1000_discounted_product_over_1000() throws Exception {
        // given
        final Product product = new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT);
        // when
        final int discountedPrice = product.getDiscountedPrice();
        // then
        assertThat(discountedPrice).isEqualTo(1000);
    }

    @Test
    public void fixed_1000_discounted_product_under_1000() throws Exception {
        // given
        final Product product = new Product("상품명", 500, DiscountPolicy.FIX_1000_AMOUNT);
        // when
        final int discountedPrice = product.getDiscountedPrice();
        // then
        assertThat(discountedPrice).isEqualTo(0);
    }
}