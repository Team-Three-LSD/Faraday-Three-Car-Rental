/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import Entities.Booking;
import Entities.Driver;

/**
 *
 * @author Orchi
 */
public class BookingDTO implements DTO<Booking>
{
    public String pickUpTime;
    public String deliveryTime;
    public double totalPrice;
    public String pickUpPlace;
    public String deliveryPlace;
    public DriverDTO driver;
    public String car;

    public BookingDTO(Booking booking) {
        this.pickUpTime = booking.getPickUpTime().toString();
        this.deliveryTime = booking.getDeliveryTime().toString();
        this.totalPrice = booking.getTotalPrice();
        this.pickUpPlace = booking.getPickUpPlace().getName();
        this.deliveryPlace = booking.getDeliveryPlace().getName();
        
        Driver d = booking.getDriver();
        this.driver = new DriverDTO(d.getName(), d.getAge(), d.getDriverLicenseNumber());
    }
    
    @Override
    public Booking fromDTO(){
        // Recreate the booking object containing all it's references
        return new Booking();
    }
    
}
