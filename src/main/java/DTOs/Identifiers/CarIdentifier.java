package DTOs.Identifiers;

/**
 * CarIdentifier This is the data transmission object used for identifying a
 * car
 *
 * @since 1.0
 */
public abstract class CarIdentifier {

    /**
     * Used to specify the id of the car
     *
     * @since 1.0
     */
    private String id;

    public CarIdentifier(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
