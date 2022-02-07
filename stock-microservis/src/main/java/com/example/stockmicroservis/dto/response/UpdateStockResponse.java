package com.example.stockmicroservis.dto.response;

public class UpdateStockResponse {
    private String sku;
    private  String isbn;
    public UpdateStockResponse (){

    }
    public UpdateStockResponse(String sku, String isbn) {
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
