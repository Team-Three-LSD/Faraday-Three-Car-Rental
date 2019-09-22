package DTOs;

import entities.Driver;

/**
 * Class representing a Driver Data Transfer Object
 * @author Orchi
 */
public class DriverDTO implements DTO<Driver> {

    public String name;
    public int age;
    public String driverLicenseNumber;

    public DriverDTO(String name, int age, String driverLicenseNumber) {
        this.name = name;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    @Override
    public Driver fromDTO() {
        return new Driver(name, age, driverLicenseNumber);
    }

}
