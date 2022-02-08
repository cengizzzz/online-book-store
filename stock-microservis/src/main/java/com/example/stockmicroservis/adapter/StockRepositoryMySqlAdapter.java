package com.example.stockmicroservis.adapter;

import com.example.stockmicroservis.repository.StockJpaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import stock.domain.Stock;
import stock.domain.StockKeepingUnit;
import stock.repository.StockRepository;

@Repository
public class StockRepositoryMySqlAdapter implements StockRepository {

    private StockJpaRepository stockJpaRepository;
    private ModelMapper mapper;

    public StockRepositoryMySqlAdapter(StockJpaRepository stockJpaRepository, ModelMapper mapper) {
        this.stockJpaRepository = stockJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public boolean existByStockKeepingUnit(StockKeepingUnit sku) {
        return stockJpaRepository.existsById(sku.getValue());
    }

    @Override
    public Stock add(Stock stock) {
        return null;
    }

    @Override
    public Stock update(Stock stock) {
        return null;
    }
}
