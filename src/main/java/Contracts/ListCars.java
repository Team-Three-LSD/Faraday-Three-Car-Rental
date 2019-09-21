package Contracts;

import DTO.listRequest;
import DTO.listResponse;

/**
 * ListCars.
 * This is an interface used when exchanging data regarding available cars for rental, between the frontend and the backend
 * @since 1.0
 */
public interface ListCars {

    /**
     * GetAvailableCars
     * This method returns a list containing 0 or more cars that satisfies the search parameters
     * @param listRequest this is a DTO containing information regarding cartype, pickup station, startdate and enddate
     * @return listResponse this is a DTO containing a list of cars. The list can have length >= 0.
     * @since 1.0
     */
    listResponse GetAvailableCars(listRequest listRequest);
}
