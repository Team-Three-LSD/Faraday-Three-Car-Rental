package interfaces;

import DTOs.BookingDTO;
import java.util.List;

/**
 * This is an interface used, between the frontend and the backend.
 *
 * @since 1.0
 */
public interface IBooking {

    public BookingDTO addNewBooking(
            String carType,
            String pickUpCity,
            String pickUpLocation,
            String deliveryLocation,
            String startDate,
            String endDate
    ) throws Exception;

    public List<BookingDTO> searchBooking(String driverLicenseNumber) throws Exception;

    /**
     * cancelBooking This method takes care of marking a booking as cancelled.
     *
     * @param bookingIdentifier this is a booking id.
     * @return boolean this is a parameter that will return if the operation was
     * successful.
     * @since 1.0
     */
    boolean cancelBooking(String bookingIdentifier);
}
