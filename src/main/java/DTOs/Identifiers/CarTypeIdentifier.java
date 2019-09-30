/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs.Identifiers;

/**
 * BookingIdentifier This is the data transmission object used for identifying a
 * car type
 *
 * @since 1.0
 */
public abstract class CarTypeIdentifier {

    /**
     * Used to specify the id of the car type
     *
     * @since 1.0
     */
    private String id;

    public CarTypeIdentifier(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
