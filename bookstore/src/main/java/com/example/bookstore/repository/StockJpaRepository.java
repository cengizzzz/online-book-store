package com.example.bookstore.repository;

import com.example.bookstore.entity.BookStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockJpaRepository extends JpaRepository<BookStock,String> {
}
