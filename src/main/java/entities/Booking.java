/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDateTime;

/**
 *
 * @author stanislavnovitski
 */
public class Booking {

    private String id;
    private LocalDateTime pickUpTime;
    private LocalDateTime deliveryTime;
    private double totalPrice;
    private Station pickUpPlace;
    private Station deliveryPlace;
    private Driver driver;
    private Car car;
    private final double EXTRA_FEE = 10.00; // TODO this can be what ever we decide.
    private boolean hasExtraFee = false;

    public Booking(String id, LocalDateTime pickUpTime, LocalDateTime deliveryTime, double totalPrice, Station pickUpPlace, Station deliveryPlace, Driver driver, Car car) {
        this.id = id;
        this.pickUpTime = pickUpTime;
        this.deliveryTime = deliveryTime;
        this.totalPrice = totalPrice;
        this.pickUpPlace = pickUpPlace;
        this.deliveryPlace = deliveryPlace;
        this.driver = driver;
        this.car = car;

        // Set the extra fee to true if the delivery place is the same as the pickup
        if (pickUpPlace.equals(deliveryPlace)) {
            this.hasExtraFee = true;
            this.totalPrice += this.EXTRA_FEE;
        }
    }

    public Booking() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalDateTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Station getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(Station pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public Station getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(Station deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
