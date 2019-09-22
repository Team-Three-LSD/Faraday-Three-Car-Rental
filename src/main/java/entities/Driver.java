/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class Driver {

    private String id;
    private String name;
    private int age;
    private String driverLicenseNumber;
    private List<Booking> bookings;

    public Driver(String id, String name, int age, String driverLicenseNumber, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
        this.bookings = bookings;
    }

    public Driver(String name, int age, String driverLicenseNumber) {
        this.name = name;
        this.age = age;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

}
