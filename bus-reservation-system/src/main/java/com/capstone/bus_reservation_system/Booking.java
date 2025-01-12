package com.capstone.bus_reservation_system;

import model.Bus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

    @Id
    private Long id;
    @ManyToOne
    private Bus bus;
    private Long userId;
    private String passengerName;
    private String seatPreference;
    private String bookingDate;

    // Getters and Setters
}
