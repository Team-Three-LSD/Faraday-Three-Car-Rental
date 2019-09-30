package DTOs;

import DTOs.Identifiers.DriverIdentifier;

public class DriverDetails extends DriverIdentifier {

    private String name;
    private int age;
    private String driverLicenseNumber;

    public DriverDetails(String id, String name, int age, String driverLicenseNumber) {
        super(id);
        this.name = name;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public String getDriverLicenseNumber() { return driverLicenseNumber; }
}
