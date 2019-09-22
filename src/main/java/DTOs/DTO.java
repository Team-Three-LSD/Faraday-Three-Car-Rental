package DTOs;

/**
 *  
 * Interface for Data Transfer Objects to inherit from
 * @author Orchi
 * @param <T>
 */
public interface DTO<T> {
    
    public T fromDTO();
    
}
