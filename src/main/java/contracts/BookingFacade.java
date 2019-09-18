/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public BookingDTO addNewBooking(String carType, String pickUpCity, String pickUpLocation, String deliveryLocation, String startDate, String endDate) throws Exception {
        // DO database stuff and return the resulting booking if success else throw errors

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookingDTO> searchBooking(String driverLicenseNumber) throws Exception {
        // DO database stuff and return the resulting booking if success else throw errors

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
