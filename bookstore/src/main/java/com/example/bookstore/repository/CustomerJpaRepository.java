package com.example.bookstore.repository;

import com.example.bookstore.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer,String> {
}
