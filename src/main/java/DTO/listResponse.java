package DTO;

import Entities.Car;

import java.util.List;

/**
 * listResponse
 * This is the data transmission object used when responding to information regarding available rental cars
 * Used as return type for GetAvailableCars
 * @since 1.0
 */
public class listResponse
{
    /**
     * Used as container for all available rental cars
     * @since 1.0
     */
    List<Car> cars;
}
