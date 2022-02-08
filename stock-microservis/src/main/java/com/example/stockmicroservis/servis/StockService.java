package com.example.stockmicroservis.servis;

import com.example.stockmicroservis.dto.request.AddStockRequest;
import com.example.stockmicroservis.dto.request.UpdateStockRequest;
import com.example.stockmicroservis.dto.response.AddStockResponse;
import com.example.stockmicroservis.dto.response.UpdateStockResponse;

public interface StockService {
    AddStockResponse addStock (AddStockRequest request);
    UpdateStockResponse updateStock (UpdateStockRequest request);
}
