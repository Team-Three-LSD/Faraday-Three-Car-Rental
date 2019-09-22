package contracts;

import DTOs.BookingDTO;
import exceptions.AddNewBookingException;
import exceptions.CancelBookingException;
import exceptions.SearchBookingException;
import interfaces.IBooking;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class BookingFacade implements IBooking {

    @Override
    public BookingDTO addNewBooking(String carTypeName,
            String pickUpCity,
            String pickUpLocation,
            String deliveryLocation,
            String startDate,
            String endDate,
            String driverName,
            String driverAge,
            String driverLicenseNumber,
            String carLicensePlate
    ) throws AddNewBookingException, RemoteException {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDTO> searchBooking(String driverLicenseNumber) throws SearchBookingException, RemoteException {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelBooking(String bookingIdentifier) throws CancelBookingException, RemoteException {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
