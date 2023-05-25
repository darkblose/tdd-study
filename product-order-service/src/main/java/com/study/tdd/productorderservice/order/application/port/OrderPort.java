package com.study.tdd.productorderservice.order.application.port;

import com.study.tdd.productorderservice.order.domain.Order;
import com.study.tdd.productorderservice.product.domain.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
