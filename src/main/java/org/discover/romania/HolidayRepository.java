package org.discover.romania;

import lombok.Getter;
import org.discover.romania.domain.*;

import java.time.Period;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

@Getter
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

    Holiday holidayBucharest = Holiday.builder()
            .destination(Destination.builder().city(City.BUCHAREST).neighbourhood(Neighbourhood.OLD_TOWN_BUCHAREST).region(Region.MUNTENIA).build())
            .period(Period.ofDays(2))
            .build();

}
