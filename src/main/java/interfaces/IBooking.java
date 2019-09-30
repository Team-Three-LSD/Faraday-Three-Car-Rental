package interfaces;

import DTOs.Identifiers.BookingIdentifier;
import DTOs.Identifiers.DriverIdentifier;
import exceptions.AddNewBookingException;
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
     * @param booking a BookingIdentifier DTO object implementation
     * @return BookingIdentifier an representation of the finished booking.
     * @throws AddNewBookingException
     * @throws java.rmi.RemoteException
     */
    public BookingIdentifier addNewBooking(BookingIdentifier booking) throws AddNewBookingException, RemoteException;

    /**
     * Search for a booking via a driversLicenseNumber
     *
     * @param id
     * @return List of BookingDetails DTO objects
     * @throws SearchBookingException
     * @throws java.rmi.RemoteException
     */
    public List<BookingIdentifier> searchBooking(DriverIdentifier id) throws SearchBookingException, RemoteException;

    /**
     * cancelBooking This method takes care of marking a booking as cancelled.
     * it needs a bookingIdentifier to cancel a booking.
     *
     *
     * @param bookingIdentifier this is a booking id.
     * @throws java.rmi.RemoteException
     * @since 1.0
     */
    void cancelBooking(BookingIdentifier bookingIdentifier) throws RemoteException;
}
