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
     * addNewBooking This method is used to create a new bookingId in the system
     * and database.
     *
     * @param bookingId a BookingIdentifier DTO object implementation
     * @return BookingIdentifier an representation of the finished bookingId.
     * @throws AddNewBookingException
     * @throws java.rmi.RemoteException
     */
    public BookingIdentifier addNewBooking(BookingIdentifier bookingId) throws AddNewBookingException, RemoteException;

    /**
     * Search for a booking via a driversLicenseNumber
     *
     * @param dirverId
     * @return List of BookingDetails DTO objects
     * @throws SearchBookingException
     * @throws java.rmi.RemoteException
     */
    public List<BookingIdentifier> searchBooking(DriverIdentifier dirverId) throws SearchBookingException, RemoteException;

    /**
     * cancelBooking This method takes care of marking a booking as cancelled.
     * it needs a bookingId to cancel a booking.
     *
     *
     * @param bookingId this is a booking id.
     * @throws java.rmi.RemoteException
     * @since 1.0
     */
    void cancelBooking(BookingIdentifier bookingId) throws RemoteException;
}
