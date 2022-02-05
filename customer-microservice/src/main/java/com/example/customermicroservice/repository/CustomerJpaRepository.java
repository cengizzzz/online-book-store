package com.example.customermicroservice.repository;

import com.example.customermicroservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer,String> {
}
