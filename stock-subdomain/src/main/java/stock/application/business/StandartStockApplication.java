package stock.application.business;

import stock.application.StockApplication;
import stock.application.business.event.StockAddedEvent;
import stock.repository.StockRepository;
import stock.application.business.exception.ExistingStockException;
import stock.application.business.exception.StockNotFoundException;
import stock.insfrastructure.StockEventPublisher;
import stock.domain.Stock;

public class StandartStockApplication implements StockApplication {
private StockRepository stockRepository;
private StockEventPublisher stockEventPublisher;

    public StandartStockApplication(StockRepository stockRepository, StockEventPublisher stockEventPublisher) {
        this.stockRepository = stockRepository;
        this.stockEventPublisher = stockEventPublisher;
    }

    @Override
    public Stock addStock(Stock stock) {
        var StockKeepingUnit = stock.getSku();
        if(stockRepository.existByStockKeepingUnit(StockKeepingUnit)){
            throw new ExistingStockException("Stock alredy exist", StockKeepingUnit.getValue());
        }
        Stock addStock = stockRepository.add(stock);
        var businessEvent = new StockAddedEvent(addStock);
        stockEventPublisher.stockPublishEvent(businessEvent);
        return addStock;
    }

    @Override
    public Stock updateStock(Stock stock) {
        var StockKeepingUnit =stock.getSku();
        if (!stockRepository.existByStockKeepingUnit(StockKeepingUnit)){
            throw new StockNotFoundException("stock does not exist.", StockKeepingUnit.getValue());
        }
        Stock update = stockRepository.update(stock);
        var businessEvent = new StockAddedEvent(update);
        stockEventPublisher.stockPublishEvent(businessEvent);


        return update;
    }
}

