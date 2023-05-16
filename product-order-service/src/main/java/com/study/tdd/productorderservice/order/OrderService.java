package com.study.tdd.productorderservice.order;

import com.study.tdd.productorderservice.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class OrderService {
    private final OrderPort orderPort;

    public void createOrder(final CreateOrderRequest request) {
        final Product product = orderPort.getProductById(request.productId());

        final Order order = new Order(product, request.quantity());

        orderPort.save(order);
    }
}
