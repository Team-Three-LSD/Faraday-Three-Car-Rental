/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs;

import DTOs.Identifiers.CarTypeIdentifier;

/**
 *
 * @author stanislavnovitski
 */
public class CarTypeDetails extends CarTypeIdentifier {

    private String name;
    private int numberOfSeats;
    private double pricePerDay;

    public CarTypeDetails(String id, String name, int numberOfSeats, double pricePerDay) {
        super(id);
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.pricePerDay = pricePerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

}
