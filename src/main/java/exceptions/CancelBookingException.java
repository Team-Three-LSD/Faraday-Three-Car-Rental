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
public class CancelBookingException extends RuntimeException{

    public CancelBookingException(String message) {
        super(message);
    }

    public CancelBookingException() {
        super("The operation of cancelling your booking went wrong.");
    }  
}
