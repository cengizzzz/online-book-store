package stock.application.business.exception;

public class StockNotFoundException extends RuntimeException{
    private final String sku;

    public StockNotFoundException(String message, String sku) {
        super(message);
        this.sku = sku;
    }
    public String getSku(){
        return sku;
    }

}
