package DTOs;

import DTOs.Identifiers.CarIdentifier;

public class CarDetails extends CarIdentifier {

    private CarTypeDetails carType;
    private String licensePlate;

    public CarDetails(String id, CarTypeDetails carType, String licensePlate) {
        super(id);
        this.carType = carType;
        this.licensePlate = licensePlate;
    }

    public CarTypeDetails getCarType() { return carType; }

    public String getLicensePlate() { return licensePlate; }
}
