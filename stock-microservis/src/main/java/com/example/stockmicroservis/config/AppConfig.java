package com.example.stockmicroservis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stock.application.StockApplication;
import stock.application.business.StandartStockApplication;
import stock.insfrastructure.StockEventPublisher;
import stock.repository.StockRepository;

@Configuration
public class AppConfig {
    @Bean
    public StockApplication stockApp (StockRepository stockRepository, StockEventPublisher eventPublisher){
        return new StandartStockApplication(stockRepository, eventPublisher);
    }

}
