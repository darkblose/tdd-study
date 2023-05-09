package com.study.tdd.productorderservice.product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);
}
