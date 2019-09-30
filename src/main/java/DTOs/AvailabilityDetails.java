package DTOs;

import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.time.LocalDateTime;

/**
 * Class representing a "Show available rental cars" Data Transfer Object
 *
 * @author Jacob
 */
public class AvailabilityDetails {

    private LocalDateTime pickUpTime;
    private LocalDateTime deliveryTime;
    private StationIdentifier pickUpPlace;
    private CarIdentifier car;

    public AvailabilityDetails(LocalDateTime pickUpTime, LocalDateTime deliveryTime, StationIdentifier pickUpPlace, CarIdentifier car) {
        this.pickUpTime = pickUpTime;
        this.deliveryTime = deliveryTime;
        this.pickUpPlace = pickUpPlace;
        this.car = car;
    }

}
