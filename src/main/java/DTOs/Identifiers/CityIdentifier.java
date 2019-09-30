/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTOs.Identifiers;

/**
 * CarIdentifier This is the data transmission object used for identifying a
 * city
 *
 * @since 1.0
 */
public abstract class CityIdentifier {

    /**
     * Used to specify the id of the city
     *
     * @since 1.0
     */
    private String id;

    public CityIdentifier(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
