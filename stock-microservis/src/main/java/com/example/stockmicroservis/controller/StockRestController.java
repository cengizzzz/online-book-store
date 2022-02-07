package com.example.stockmicroservis.controller;

import com.example.stockmicroservis.dto.request.AddStockRequest;
import com.example.stockmicroservis.dto.request.UpdateStockRequest;
import com.example.stockmicroservis.dto.response.AddStockResponse;
import com.example.stockmicroservis.dto.response.UpdateStockResponse;
import com.example.stockmicroservis.servis.StockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
@RequestMapping("stocks")
@CrossOrigin
@Validated
@Api( tags = "Stocks")
public class StockRestController {
    private StockService stockService;

    public StockRestController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping
    public AddStockResponse addBook(
            @RequestBody @Validated AddStockRequest request){
        return stockService.addStock(request);

    }
    @PutMapping("isbn")
    public UpdateStockResponse updateBookResponse(@RequestBody @Validated UpdateStockRequest request){
        return stockService.updateStock(request);

    }

}
