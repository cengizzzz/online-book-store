package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookstore.entity.Sale;

public interface SaleJpaReporsitory extends JpaRepository<Sale,String> {
}