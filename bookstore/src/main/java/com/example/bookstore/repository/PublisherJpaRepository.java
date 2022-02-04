package com.example.bookstore.repository;

import com.example.bookstore.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherJpaRepository extends JpaRepository<Publisher,String> {
}
