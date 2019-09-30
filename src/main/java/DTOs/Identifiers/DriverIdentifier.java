package DTOs.Identifiers;

/**
 * BookingIdentifier This is the data transmission object used for identifying a
 * driver
 *
 * @since 1.0
 */
public abstract class DriverIdentifier {

    /**
     * Used to specify the id of the driver
     *
     * @since 1.0
     */
    private String id;

    public DriverIdentifier(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
