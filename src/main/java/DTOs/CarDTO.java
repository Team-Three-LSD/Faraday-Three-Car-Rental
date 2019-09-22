package DTOs;

import entities.CarType;

/**
 *
 * @author stanislavnovitski
 */
public class CarDTO implements DTO {

    private CarType carType;
    private String licensePlate;

    public CarDTO(CarType carType, String licensePlate) {
        this.carType = carType;
        this.licensePlate = licensePlate;
    }

    @Override
    public Object fromDTO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
