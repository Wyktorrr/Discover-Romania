package org.discover.romania.service;

import org.discover.romania.repository.HolidayRepository;
import org.discover.romania.domain.BashHoliday;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static org.discover.romania.domain.City.BUCHAREST;

public class HolidayService {
    private static final HolidayRepository holidayRepository = HolidayRepository.getHolidayRepositoryInstance();

    public BashHoliday createHoliday(String cityName) {

        return BashHoliday.builder()
                .items(
                        holidayRepository.getAvailableHolidays().stream()
                                .filter(h -> h.getDestination().getCity().getCityName().equalsIgnoreCase(cityName))
                                .map(p -> BashHoliday.HolidayItem.builder()
                                        .city(BUCHAREST.getCityName())
                                        .descriptionOfHolidayItem(p.getDescription())
                                        .price(100L)
                                        .tips(List.of("Have fun!", "Night life", "Drink a lot!"))
                                        .stories(List.of("Great vibe, best capital ever!"))
                                        .build())
                                .sorted()
                                .collect(Collectors.toList()))
                .createdAt(new Date())
                .lastUpdatedAt(new Date())
                .validUntil(Date.from(Instant.now().plus(2, ChronoUnit.DAYS)))
                .build();
    }
}
