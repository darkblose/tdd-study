package com.study.tdd.productorderservice.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
class ProductService {
    private final ProductPort productPort;

    @PostMapping
    @Transactional
    public ResponseEntity<Void> addProduct(@RequestBody final AddProductRequest request) {
        final Product product = new Product(request.name(), request.price(), request.discountPolicy());
        productPort.save(product);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<GetProductResponse> getProduct(@PathVariable final long productId) {
        final Product product = productPort.getProduct(productId);

        final GetProductResponse response = new GetProductResponse(product.getId(), product.getName(), product.getPrice(), product.getDiscountPolicy());

        return ResponseEntity.ok(response);
    }
}
