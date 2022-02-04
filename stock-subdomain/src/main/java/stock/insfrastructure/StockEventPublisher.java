package stock.insfrastructure;


import stock.application.business.event.StockEvent;

public interface StockEventPublisher {
    void stockPublishEvent(StockEvent businessEvent);
}
