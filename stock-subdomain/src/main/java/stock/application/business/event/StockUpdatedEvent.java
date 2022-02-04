package stock.application.business.event;

import stock.domain.Stock;

public class StockUpdatedEvent extends StockEvent {
    private final Stock stock;

    public StockUpdatedEvent(String eventId, Stock stock) {
        super(eventId);
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }
}
