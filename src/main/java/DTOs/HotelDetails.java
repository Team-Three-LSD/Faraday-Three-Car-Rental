package DTOs;

import DTOs.Identifiers.CarIdentifier;
import DTOs.Identifiers.StationIdentifier;
import java.util.List;

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

    public String getName() { return name; }

    public String getAddress() { return address; }

    public float getStarRating() { return starRating; }

    public List<CarIdentifier> getCars() { return cars; }

    public String getCityName() { return cityName; }
}
