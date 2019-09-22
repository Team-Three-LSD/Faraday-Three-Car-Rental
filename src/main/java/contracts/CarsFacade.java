package contracts;

import DTOs.CarDTO;
import exceptions.GetAvailableCarsException;
import interfaces.ICars;
import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class CarsFacade implements ICars {

    @Override
    public List<CarDTO> GetAvailableCars(String carType, String pickUpCity, String rentalStart, String rentalEnd) throws GetAvailableCarsException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
