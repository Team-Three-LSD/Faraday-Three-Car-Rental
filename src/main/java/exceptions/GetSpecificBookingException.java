/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author stanislavnovitski
 */
public class GetSpecificBookingException extends RuntimeException {

    public GetSpecificBookingException(String message) {
        super(message);
    }

    public GetSpecificBookingException() {
        super("The operation did not find any available cars.");
    }
}
