package exceptions;

public class GetSpecificBookingException extends RuntimeException {

    public GetSpecificBookingException(String message) {
        super(message);
    }

    public GetSpecificBookingException() {
        super("The operation did not find any available cars.");
    }
}
