/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public List<CarIdentifier> GetAvailableCars(AvailabilityDetails availabilty) throws GetAvailableCarsException, RemoteException;
}
