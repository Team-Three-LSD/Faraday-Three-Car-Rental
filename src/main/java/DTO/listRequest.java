package DTO;

import Entities.CarType;
import Entities.Station;

import java.time.LocalDateTime;

public class listRequest {
    public CarType carType;
    public Station pickUpLocation;
    public LocalDateTime rentalStart;
    public LocalDateTime rentalEnd;
}
