package interfaces;

import DTOs.BookingDetails;
import DTOs.Identifiers.BookingIdentifier;
import exceptions.AddNewBookingException;
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
     * @param booking
     * @return BookingDetails an representation of the finished booking.
     * @throws AddNewBookingException
     * @throws java.rmi.RemoteException
     */
    public BookingDetails addNewBooking(BookingDetails booking) throws AddNewBookingException, RemoteException;

    /**
     *  Search for a booking via a driversLicenseNumber
     * 
     * @param driverLicenseNumber
     * @return
     * @throws SearchBookingException
     * @throws java.rmi.RemoteException
     */
    public List<BookingDetails> searchBooking(String driverLicenseNumber) throws SearchBookingException, RemoteException;

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
