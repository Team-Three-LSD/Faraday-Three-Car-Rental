/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

public class SearchBookingException extends RuntimeException{

    public SearchBookingException(String message) {
        super(message);
    }

    public SearchBookingException() {
        super("The operation did not find any matching bookings.");
    }  
}
