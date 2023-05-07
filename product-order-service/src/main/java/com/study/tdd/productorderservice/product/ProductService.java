package com.study.tdd.productorderservice.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class ProductService {
    private final ProductPort productPort;

    public void addProduct(final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());
        productPort.save(product);
    }
}
