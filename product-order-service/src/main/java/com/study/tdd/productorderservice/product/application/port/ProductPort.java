package com.study.tdd.productorderservice.product.application.port;

import com.study.tdd.productorderservice.product.domain.Product;

public interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
