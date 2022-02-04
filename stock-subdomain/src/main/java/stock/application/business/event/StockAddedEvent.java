package stock.application.business.event;

import stock.domain.Stock;

public class StockAddedEvent extends StockEvent {
    private final Stock stock;

    public StockAddedEvent(Stock stock) {
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }
}
