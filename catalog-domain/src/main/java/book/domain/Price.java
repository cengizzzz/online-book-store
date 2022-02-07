package book.domain;

import java.util.Objects;

public final class Price {
    private final double price;

    private Price(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +" TL(₺)"+
                '}';
    }
    public static Price of(double price) {
        Objects.requireNonNull("Currency cannot be empty!");
        if (price <= 0.0)
            throw new IllegalArgumentException("Money value cannot be below zero and negative!");
        return new Price(price);
    }
}
