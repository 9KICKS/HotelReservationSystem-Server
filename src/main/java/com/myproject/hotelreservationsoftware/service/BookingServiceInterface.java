package com.myproject.hotelreservationsoftware.service;

import com.myproject.hotelreservationsoftware.model.BookedRoom;
import java.util.List;

public interface BookingServiceInterface {
    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}
