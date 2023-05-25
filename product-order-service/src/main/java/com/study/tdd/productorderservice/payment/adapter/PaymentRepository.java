package com.study.tdd.productorderservice.payment.adapter;

import com.study.tdd.productorderservice.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PaymentRepository extends JpaRepository<Payment, Long> {
}
