package org.discover.romania.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Book {
    private Traveler traveler;
    private Date bookTime;
    private List<Holiday> bookedHolidays;
}
