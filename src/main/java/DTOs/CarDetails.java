package DTOs;

import DTOs.Identifiers.CarIdentifier;

/**
 * Class representing a Car Data Transfer Object
 *
 * @author stanislavnovitski
 */
public class CarDetails extends CarIdentifier {

    private CarTypeDetails carType;
    private String licensePlate;

    public CarDetails(String id, CarTypeDetails carType, String licensePlate) {
        super(id);
        this.carType = carType;
        this.licensePlate = licensePlate;
    }

}
