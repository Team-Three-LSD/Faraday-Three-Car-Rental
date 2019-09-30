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
