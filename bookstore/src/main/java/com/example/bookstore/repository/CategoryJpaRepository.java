package com.example.bookstore.repository;

import com.example.bookstore.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryJpaRepository extends JpaRepository<Category,String> {
}