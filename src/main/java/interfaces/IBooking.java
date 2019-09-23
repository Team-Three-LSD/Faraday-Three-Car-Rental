package interfaces;

import DTOs.BookingDTO;
import DTOs.BookingIdentifier;
import exceptions.CancelBookingException;
import exceptions.SearchBookingException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * This is an interface used, between the frontend and the backend.
 *
 * @since 1.0
 */
public interface IBooking extends java.rmi.Remote {

    /**
     * addNewBooking This method is used to create a new booking in the system
     * and database.
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
     * @throws SearchBookingException
     * @throws java.rmi.RemoteException
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
    ) throws SearchBookingException, RemoteException;

    /**
     *  Search for a booking via a driversLicenseNumber
     * 
     * @param driverLicenseNumber
     * @return
     * @throws SearchBookingException
     * @throws java.rmi.RemoteException
     */
    public List<BookingDTO> searchBooking(String driverLicenseNumber) throws SearchBookingException, RemoteException;

    /**
     * cancelBooking This method takes care of marking a booking as cancelled.
     * it needs a bookingIdentifier to cancel a booking.
     * 
     *
     * @param bookingIdentifier this is a booking id.
     * @return boolean this is a parameter that will return if the operation was
     * successful.
     * @throws java.rmi.RemoteException
     * @throws CancelBookingException
     * @since 1.0
     */
    boolean cancelBooking(BookingIdentifier bookingIdentifier) throws CancelBookingException, RemoteException;
}
