/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

public class GetAvailableCarsException extends RuntimeException{

    public GetAvailableCarsException(String message) {
        super(message);
    }

    public GetAvailableCarsException() {
        super("The operation did not find any available cars.");
    }  
}
