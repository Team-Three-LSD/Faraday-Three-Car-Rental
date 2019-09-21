package DTO;

import Entities.CarType;
import Entities.Station;

import java.time.LocalDateTime;

/**
 * listRequest
 * This is the data transmission object used when requesting information regarding available rental cars
 * Used with the method GetAvailableCars
 * @since 1.0
 */
public class listRequest {

    /**
     * Used to specify type of car
     * @since 1.0
     */
    public CarType carType;

    /**
     * Used to specify type of pickup station
     * @since 1.0
     */
    public Station pickUpLocation;

    /**
     * Used to specify the startdate of rental periode
     * @since 1.0
     */
    public LocalDateTime rentalStart;

    /**
     * Used to specify the enddate of rental periode
     * @since 1.0
     */
    public LocalDateTime rentalEnd;
}
