package Contracts;

import DTO.listRequest;
import DTO.listResponse;

public interface ListCars {
    listResponse GetAvailableCars(listRequest listRequest);
}
