package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookJpaRepository extends JpaRepository<Book,String> {
}
