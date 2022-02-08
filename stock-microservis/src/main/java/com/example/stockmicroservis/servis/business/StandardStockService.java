package com.example.stockmicroservis.servis.business;

import com.example.stockmicroservis.dto.request.AddStockRequest;
import com.example.stockmicroservis.dto.request.UpdateStockRequest;
import com.example.stockmicroservis.dto.response.AddStockResponse;
import com.example.stockmicroservis.dto.response.UpdateStockResponse;
import com.example.stockmicroservis.servis.StockService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import stock.application.StockApplication;

@Service
public class StandardStockService implements StockService {
    private StockApplication stockApplication;
    private ModelMapper modelMapper;

    public StandardStockService(StockApplication stockApplication, ModelMapper modelMapper) {
        this.stockApplication = stockApplication;
        this.modelMapper = modelMapper;
    }


    @Override
    public AddStockResponse addStock(AddStockRequest request) {
        return null;
    }

    @Override
    public UpdateStockResponse updateStock(UpdateStockRequest request) {
        return null;
    }
}
