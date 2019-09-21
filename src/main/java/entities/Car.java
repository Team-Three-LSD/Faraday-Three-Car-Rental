/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author stanislavnovitski
 */
public class Car {

    private String licensePlate; // this could be used as an id in DB
    private CarType ct;

    public Car(CarType ct, String licensePlate) {
        this.ct = ct;
        this.licensePlate = licensePlate;
    }

    public CarType getCt() {
        return ct;
    }

    public void setCt(CarType ct) {
        this.ct = ct;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
