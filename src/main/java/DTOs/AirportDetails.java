/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.util.List;

public class AirportDetails extends StationIdentifier {

    private String code;
    private String name;
    private List<CarIdentifier> cars;
    private String cityName;

    public AirportDetails(String id, String code, String name, List<CarIdentifier> cars, String cityName) {
        super(id);
        this.code = code;
        this.name = name;
        this.cars = cars;
        this.cityName = cityName;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public List<CarIdentifier> getCars() {
        return cars;
    }

    public String getCityName() { return cityName; }
}
