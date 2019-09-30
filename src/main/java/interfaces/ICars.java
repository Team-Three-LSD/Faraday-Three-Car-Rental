package interfaces;

import DTOs.AvailabilityDetails;
import DTOs.Identifiers.CarIdentifier;
import exceptions.GetAvailableCarsException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * This is an interface used, between the Frontend and the Backend.
 *
 * @since 1.0
 */
public interface ICars extends Remote {

    /**
     * getAvailableCars This method returns a list containing 0 or more cars
     * that satisfies the search parameters
     *
     * @param availability
     * @return A list of CarDetails
     * @throws GetAvailableCarsException
     * @throws RemoteException
     */
    List<CarIdentifier> getAvailableCars(AvailabilityDetails availability) throws GetAvailableCarsException, RemoteException;
}
