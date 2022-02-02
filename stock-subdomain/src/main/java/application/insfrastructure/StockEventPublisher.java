package application.insfrastructure;


import application.business.event.StockEvent;

public interface StockEventPublisher {
    void stockPublishEvent(StockEvent businessEvent);
}
