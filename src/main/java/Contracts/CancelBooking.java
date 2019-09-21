package Contracts;

import DTO.BookingIdentifier;

/**
 * CancelBooking.
 * This is an interface used when canceling a booking, between the frontend and the backend
 * @since 1.0
 */
public interface CancelBooking {

    /**
     * cancelBooking
     * This method takes care of marking a booking as cancelled.
     * @param bookingIdentifier this is a DTO containing information regarding the booking id.
     * @return boolean this is a parameter that will return if the operation was successful.
     * @since 1.0
     */
    boolean cancelBooking(BookingIdentifier bookingIdentifier);
}