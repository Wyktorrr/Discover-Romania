package org.discover.romania;

import org.discover.romania.domain.Destination;
import org.discover.romania.domain.Holiday;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class HolidayRepository {

    private List<Destination> availableDestinations;


//    DateTime start = new DateTime(2004, 12, 25, 0, 0, 0, 0);
//    DateTime end = new DateTime(2005, 1, 1, 0, 0, 0, 0);
//    Interval interval = new Interval(start, end);
//    Period period = interval.toPeriod();
    private final List<Holiday> availableHolidays = Collections.singletonList(Holiday.builder().availableDestinations(availableDestinations).build());
    public List<Holiday> listAvailableHolidays() {
        return availableHolidays;
    }

    public HolidayRepository(List<Destination> availableDestinations) {
        this.availableDestinations = availableDestinations;
    }
}
