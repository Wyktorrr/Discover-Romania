package org.discover.romania;

import org.discover.romania.domain.BashHoliday;
import org.discover.romania.domain.City;
import org.discover.romania.domain.Destination;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class HolidayService {
    protected static final List<Destination> availableDestinations = new ArrayList<>();
    protected static final HolidayRepository holidayRepository= new HolidayRepository(availableDestinations);

    public BashHoliday createHoliday() {


        ///Fix this!!
        return BashHoliday.builder()
                .items(
                        holidayRepository.listAvailableHolidays().stream()
                                .filter(p -> p.getDestination().getCity().equals(City.BRASOV))
                                .map(p -> BashHoliday.HolidayItems.builder()
                                        .description(p.getDescription())
                                        .build())
                                .sorted()
                                .collect(Collectors.toList()))
                .createdAt(new Date())
                .lastUpdatedAt(new Date())
                .validUntil(Date.from(Instant.now().plus(2, ChronoUnit.DAYS)))
                .build();
    }
}
