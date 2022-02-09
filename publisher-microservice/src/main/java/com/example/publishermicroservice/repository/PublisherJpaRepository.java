package com.example.publishermicroservice.repository;

import com.example.publishermicroservice.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherJpaRepository extends JpaRepository<Publisher,String> {
}
