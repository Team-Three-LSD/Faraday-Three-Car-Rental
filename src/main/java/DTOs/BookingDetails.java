package DTOs;

import DTOs.Identifiers.BookingIdentifier;
import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.DriverIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.time.LocalDateTime;

public class BookingDetails extends BookingIdentifier {

    private LocalDateTime pickUpTime;
    private LocalDateTime deliveryTime;
    private StationIdentifier pickUpPlace;
    private StationIdentifier deliveryPlace;
    private DriverIdentifier driver;
    private CarIdentifier car;
    private double totalPrice;

    public BookingDetails(LocalDateTime pickUpTime, LocalDateTime deliveryTime, StationIdentifier pickUpPlace, StationIdentifier deliveryPlace, DriverIdentifier driver, CarIdentifier car, double totalPrice, String bookingId) {
        super(bookingId);
        this.pickUpTime = pickUpTime;
        this.deliveryTime = deliveryTime;
        this.pickUpPlace = pickUpPlace;
        this.deliveryPlace = deliveryPlace;
        this.driver = driver;
        this.car = car;
        this.totalPrice = totalPrice;
    }

    public LocalDateTime getPickUpTime() { return pickUpTime; }

    public LocalDateTime getDeliveryTime() { return deliveryTime; }

    public StationIdentifier getPickUpPlace() { return pickUpPlace; }

    public StationIdentifier getDeliveryPlace() { return deliveryPlace; }

    public DriverIdentifier getDriver() { return driver; }

    public CarIdentifier getCar() { return car; }

    public double getTotalPrice() { return totalPrice; }
}
