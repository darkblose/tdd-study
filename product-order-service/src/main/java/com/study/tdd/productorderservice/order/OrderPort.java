package com.study.tdd.productorderservice.order;

import com.study.tdd.productorderservice.product.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
