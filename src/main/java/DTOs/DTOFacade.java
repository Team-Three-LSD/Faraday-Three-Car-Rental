package DTOs;

import com.google.gson.Gson;

/**
 * Class representing a Facade to Data Transfer Object usage
 * @author Orchi
 */
public class DTOFacade {

    private static final Gson gson = new Gson();

    public static String DTOtoJson(DTO jm) {
        return gson.toJson(jm);
    }

    public static <T extends DTO> T jsonToDTO(String json, Class<T> c) {
        return gson.fromJson(json, c);
    }

    public static <T2, T extends DTO<T2>> T2 fromJson(String json, Class<T> DTOClass) {
        return jsonToDTO(json, DTOClass).fromDTO();
    }

}
