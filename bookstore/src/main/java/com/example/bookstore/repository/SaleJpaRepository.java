package com.example.bookstore.repository;

import com.example.bookstore.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleJpaRepository extends JpaRepository<Sale,String> {
}
