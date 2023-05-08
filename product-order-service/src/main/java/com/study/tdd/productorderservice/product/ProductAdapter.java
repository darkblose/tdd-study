package com.study.tdd.productorderservice.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class ProductAdapter implements ProductPort {
    private final ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
