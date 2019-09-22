package entities;

import java.util.List;

/**
 *
 * @author stanislavnovitski
 */
public class Airport extends Station {

    private String code;

    public Airport(String name, List<Car> cars, String code) {
        super(name, cars);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
