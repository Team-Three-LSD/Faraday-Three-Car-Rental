/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.time.LocalDateTime;

/**
 *
 * @author stanislavnovitski
 */
public class Booking {

    private LocalDateTime pickUpTime;
    private LocalDateTime deliveryTime;
    private double totalPrice;
    private Station pickUpPlace;
    private Station deliveryPlace;
    private Driver driver;
    private Car car;

    public Booking(LocalDateTime pickUpTime, LocalDateTime deliveryTime, double totalPrice, Station pickUpPlace, Station deliveryPlace, Driver driver, Car car) {
        this.pickUpTime = pickUpTime;
        this.deliveryTime = deliveryTime;
        this.totalPrice = totalPrice;
        this.pickUpPlace = pickUpPlace;
        this.deliveryPlace = deliveryPlace;
        this.driver = driver;
        this.car = car;
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
