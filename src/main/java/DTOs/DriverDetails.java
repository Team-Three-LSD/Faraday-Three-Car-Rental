package DTOs;

import DTOs.Identifiers.DriverIdentifier;

/**
 * Class representing a Driver Data Transfer Object
 *
 * @author Orchi
 */
public class DriverDetails extends DriverIdentifier {

    public String name;
    public int age;
    public String driverLicenseNumber;

    public DriverDetails(String id, String name, int age, String driverLicenseNumber) {
        super(id);
        this.name = name;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
    }

}
