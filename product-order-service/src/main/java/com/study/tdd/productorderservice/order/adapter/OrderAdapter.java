package com.study.tdd.productorderservice.order.adapter;

import com.study.tdd.productorderservice.order.OrderPort;
import com.study.tdd.productorderservice.order.domain.Order;
import com.study.tdd.productorderservice.product.adapter.ProductRepository;
import com.study.tdd.productorderservice.product.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class OrderAdapter implements OrderPort {
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    @Override
    public Product getProductById(final Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }

    @Override
    public void save(final Order order) {
        orderRepository.save(order);
    }
}
