package requistion.application.business.exception;

public class RequistionNotFoundException extends RuntimeException{
    private final String requistionID;

    public RequistionNotFoundException(String message, String requistionID) {
        super(message);
        this.requistionID = requistionID;
    }

    public String getRequistionID() {
        return requistionID;
    }
}
