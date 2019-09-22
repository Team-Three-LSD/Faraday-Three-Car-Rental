/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Orchi
 */
public class AddNewBookingException extends RuntimeException{

    public AddNewBookingException(String message) {
        super(message);
    }

    public AddNewBookingException() {
        super("The operation of adding your booking went wrong.");
    }  
}
