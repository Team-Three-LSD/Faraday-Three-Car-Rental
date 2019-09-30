package interfaces;

import DTOs.AvailabilityDetails;
import DTOs.Identifiers.CarIdentifier;
import exceptions.GetAvailableCarsException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public interface ICars extends Remote {

    /**
     * GetAvailableCars This method returns a list containing 0 or more cars
     * that satisfies the search parameters
     *
     * @param availabilty
     * @return A list of CarDetails
     * @throws GetAvailableCarsException
     * @throws RemoteException
     */
    List<CarIdentifier> GetAvailableCars(AvailabilityDetails availabilty) throws GetAvailableCarsException, RemoteException;
}
