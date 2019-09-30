package DTOs;

import DTOs.Identifiers.CarTypeIdentifier;

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

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }
}
