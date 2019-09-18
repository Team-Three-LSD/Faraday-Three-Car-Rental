package interfaces;

import DTOs.BookingDTO;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stanislavnovitski
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
}
