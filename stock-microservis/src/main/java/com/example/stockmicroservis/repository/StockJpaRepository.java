package com.example.stockmicroservis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.domain.Stock;

public interface StockJpaRepository extends JpaRepository <Stock,String>{
}
