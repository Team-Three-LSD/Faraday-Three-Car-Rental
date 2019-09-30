package exceptions;

public class SearchBookingException extends RuntimeException{

    public SearchBookingException(String message) {
        super(message);
    }

    public SearchBookingException() {
        super("The operation did not find any matching bookings.");
    }  
}
