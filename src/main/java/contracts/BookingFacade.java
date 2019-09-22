package contracts;

import DTOs.BookingDTO;
import interfaces.IBooking;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class BookingFacade implements IBooking {

    @Override
    public BookingDTO addNewBooking(String carTypeName, String pickUpCity, String pickUpLocation, String deliveryLocation, String startDate, String endDate, String driverName, String driverAge, String driverLicenseNumber, String carLicensePlate) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDTO> searchBooking(String driverLicenseNumber) throws Exception {
        // DO database stuff and return the resulting booking if success else throw errors

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cancelBooking(String bookingIdentifier) {
        // DO database stuff and return the resulting booking if success else throw errors

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
