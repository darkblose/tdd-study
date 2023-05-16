package com.study.tdd.productorderservice.order;

import com.study.tdd.productorderservice.product.Product;
import lombok.Getter;
import org.springframework.util.Assert;

@Getter
class Order {

    private Long id;
    private final Product product;
    private final int quantity;

    public Order(final Product product, final int quantity) {
        this.product = product;
        this.quantity = quantity;
        Assert.notNull(product, "상품은 필수입니다.");
        Assert.isTrue(quantity > 0, "수량은 0보다 커야 합니다.");
    }

    public void assignId(final Long id) {
        this.id = id;
    }
}
