package com.example.customermicroservice.repository;

import com.example.customermicroservice.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerJpaRepository extends JpaRepository<Customer,String> {
}
