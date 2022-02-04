package requistion.application.business.exception;

public class ExistingRequistionException extends RuntimeException{
    private final String requistionID;

    public ExistingRequistionException(String message, String requistionID) {
        super(message);
        this.requistionID = requistionID;
    }

    public String getRequistionID() {
        return requistionID;
    }
}
