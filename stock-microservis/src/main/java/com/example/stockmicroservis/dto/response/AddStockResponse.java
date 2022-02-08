package com.example.stockmicroservis.dto.response;

import stock.application.StockApplication;
import stock.domain.Stock;

public class AddStockResponse {

   private String sku;
   private  String isbn;
public AddStockResponse (){

}
    public AddStockResponse(String sku, String isbn) {
        this.sku = sku;
        this.isbn = isbn;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "AddStockResponse{" +
                "sku='" + sku + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
