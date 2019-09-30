package DTOs;

import DTOs.Identifiers.BookingIdentifier;
import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.StationIdentifier;

import java.time.LocalDateTime;

public class BookingSummary extends BookingIdentifier {

    private LocalDateTime pickUpTime;
    private StationIdentifier pickUpPlace;
    private CarIdentifier car;

    public BookingSummary(LocalDateTime pickUpTime, StationIdentifier pickUpPlace, CarIdentifier car, String bookingId) {
        super(bookingId);
        this.pickUpTime = pickUpTime;
        this.pickUpPlace = pickUpPlace;
        this.car = car;
    }

    public LocalDateTime getPickUpTime() { return pickUpTime; }

    public StationIdentifier getPickUpPlace() { return pickUpPlace; }

    public CarIdentifier getCar() { return car; }
}
