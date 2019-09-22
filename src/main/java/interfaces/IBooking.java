package interfaces;

import DTOs.BookingDTO;
import java.util.List;

/**
 * This is an interface used, between the frontend and the backend.
 * 
 * @since 1.0
 */
public interface IBooking {

    /**
     * addNewBooking This method is used to create a new booking in database
     * 
     * @param carTypeName
     * @param pickUpCity
     * @param pickUpLocation
     * @param deliveryLocation
     * @param startDate
     * @param endDate
     * @param driverName
     * @param driverAge
     * @param driverLicenseNumber
     * @param carLicensePlate
     * @return BookingDTO an representation of the finished booking.
     * @throws Exception 
     */
    public BookingDTO addNewBooking(
            String carTypeName,
            String pickUpCity,
            String pickUpLocation,
            String deliveryLocation,
            String startDate,
            String endDate,
            String driverName,
            String driverAge,
            String driverLicenseNumber,
            String carLicensePlate     
    ) throws Exception;

    /**
     *
     * @param driverLicenseNumber
     * @return
     * @throws Exception
     */
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
