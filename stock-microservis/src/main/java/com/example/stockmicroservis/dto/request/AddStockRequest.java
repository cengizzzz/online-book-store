package com.example.stockmicroservis.dto.request;

import com.example.stockmicroservis.validation.IsbnValidation;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class AddStockRequest {
    @Id
    @IsbnValidation
    private String Isbn;
    @NotBlank
    private String SellNumber;
    @NotBlank
    private String StockNumber;
    @NotBlank
    private String StockKeepingUnit;

    public AddStockRequest(){

    }
    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getSellNumber() {
        return SellNumber;
    }

    public void setSellNumber(String sellNumber) {
        SellNumber = sellNumber;
    }

    public String getStockNumber() {
        return StockNumber;
    }

    public void setStockNumber(String stockNumber) {
        StockNumber = stockNumber;
    }

    public String getStockKeepingUnit() {
        return StockKeepingUnit;
    }

    public void setStockKeepingUnit(String stockKeepingUnit) {
        StockKeepingUnit = stockKeepingUnit;
    }

    @Override
    public String toString() {
        return "AddStockRequest{" +
                "Isbn='" + Isbn + '\'' +
                ", SellNumber='" + SellNumber + '\'' +
                ", StockNumber='" + StockNumber + '\'' +
                ", StockKeepingUnit='" + StockKeepingUnit + '\'' +
                '}';
    }
}
