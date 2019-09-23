package DTOs.Identifiers;

/**
 * BookingIdentifier This is the data transmission object used for identifying a
 * booking
 *
 * @since 1.0
 */
public abstract class BookingIdentifier {

    /**
     * Used to specify the id of the booking
     *
     * @since 1.0
     */
    private String bookingId;

    public BookingIdentifier(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

}
