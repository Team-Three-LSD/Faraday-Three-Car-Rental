/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import DTOs.Identifiers.CityIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.util.List;

public class CityDetails extends CityIdentifier {

    private String name;
    private List<StationIdentifier> stations;

    public CityDetails(String id, String name, List<StationIdentifier> stations) {
        super(id);
        this.name = name;
        this.stations = stations;
    }

    public String getName() { return name; }

    public List<StationIdentifier> getStations() { return stations; }
}
