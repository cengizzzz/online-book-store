package com.example.stockmicroservis.entity;

import com.example.stockmicroservis.validation.IsbnValidation;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name="stocks")
@DynamicUpdate
public class Stock {
@Id
@IsbnValidation
private String Isbn;
@NotBlank
    private String SellNumber;
@NotBlank
    private String StockNumber;
@NotBlank
    private String StockKeepingUnit;


    public Stock() {

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

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "SellNumber='" + SellNumber + '\'' +
                ", StockNumber='" + StockNumber + '\'' +
                ", StockKeepingUnit='" + StockKeepingUnit + '\'' +
                ", Isbn='" + Isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(StockKeepingUnit, stock.StockKeepingUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StockKeepingUnit);
    }
}
