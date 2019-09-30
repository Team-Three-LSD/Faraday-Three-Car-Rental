package exceptions;

public class AddNewBookingException extends RuntimeException{

    public AddNewBookingException(String message) {
        super(message);
    }

    public AddNewBookingException() {
        super("The operation of adding your booking went wrong.");
    }  
}
