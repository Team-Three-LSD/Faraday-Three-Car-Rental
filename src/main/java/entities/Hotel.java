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
public class Hotel extends Station {

    private String code;
    private String address;
    private int starRating;

    public Hotel(String code, String name, List<Car> cars, String address, int starRating) {
        super(name, cars);
        this.code = code;
        this.address = address;
        this.starRating = starRating;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

}
