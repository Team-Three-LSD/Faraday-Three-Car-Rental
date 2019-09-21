/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DTOs.CarDTO;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public interface ICars {

    /**
     * GetAvailableCars This method returns a list containing 0 or more cars
     * that satisfies the search parameters
     *
     * @param carType String of chosen car type
     * @param pickUpCity String of pickup city name
     * @param rentalStart String of rental start date and time
     * @param rentalEnd String of rental end date and time
     * @return List of CarDTO this is a List containing a list of cars. The list
     * can have length >= 0.
     * @since 1.0
     */
    public List<CarDTO> GetAvailableCars(String carType, String pickUpCity, String rentalStart, String rentalEnd);
}
