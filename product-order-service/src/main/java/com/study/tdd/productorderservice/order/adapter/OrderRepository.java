package com.study.tdd.productorderservice.order.adapter;

import com.study.tdd.productorderservice.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface OrderRepository extends JpaRepository<Order, Long> {
}
