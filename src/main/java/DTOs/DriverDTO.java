/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import entities.Driver;

/**
 *
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
