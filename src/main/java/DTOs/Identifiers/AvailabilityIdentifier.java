package DTOs.Identifiers;

/**
 * AvailabilityIdentifier This is the data transmission object used for identifying 
 * available rental cars
 *
 * @since 1.0
 */
public abstract class AvailabilityIdentifier {

    /**
     * Used to specify the id of the available rental cars
     *
     * @since 1.0
     */
    private String availabilityId;

    public AvailabilityIdentifier(String availabilityId) {
        this.availabilityId = availabilityId;
    }

    public String getAvailabilityId() {
        return availabilityId;
    }

    public void setAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
    }

}
