package exceptions;

public class GetAvailableCarsException extends RuntimeException{

    public GetAvailableCarsException(String message) {
        super(message);
    }

    public GetAvailableCarsException() {
        super("The operation did not find any available cars.");
    }  
}
