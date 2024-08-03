package org.discover.romania.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Booking {
    private Traveler traveler;
    private Date bookTime;
    private List<Holiday> bookedHolidays;
    private Date bookingTime;

    public Booking(Traveler traveler, Date bookTime, List<Holiday> bookedHolidays, Date bookingTime) {
        this.traveler = traveler;
        this.bookTime = bookTime;
        this.bookedHolidays = bookedHolidays;
        this.bookingTime = bookingTime;
    }
}
