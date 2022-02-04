package stock.application.business.exception;

public class ExistingStockException extends RuntimeException{
    private final String sku;

    public ExistingStockException(String message, String sku) {
        super(message);
        this.sku = sku;
    }
    public String getSku(){
        return sku;
    }
}
