/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class HotelDetails extends StationIdentifier {

    private String name;
    private String address;
    private float starRating;
    private List<CarIdentifier> cars;
    private String cityName;

    public HotelDetails(String id, String name, String address, float starRating, List<CarIdentifier> cars, String cityName) {
        super(id);
        this.name = name;
        this.address = address;
        this.starRating = starRating;
        this.cars = cars;
        this.cityName = cityName;
    }

}
