package com.study.tdd.productorderservice.product.adapter;

import com.study.tdd.productorderservice.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
