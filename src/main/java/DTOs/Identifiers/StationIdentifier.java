package DTOs.Identifiers;

/**
 * BookingIdentifier This is the data transmission object used for identifying a
 * station
 *
 * @since 1.0
 */
public abstract class StationIdentifier {

    /**
     * Used to specify the id of the station
     *
     * @since 1.0
     */
    private String id;

    public StationIdentifier(String id) { this.id = id; }

    public String getId() { return id; }
}
