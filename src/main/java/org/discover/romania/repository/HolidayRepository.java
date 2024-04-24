package org.discover.romania.repository;

import lombok.Getter;
import org.discover.romania.domain.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class HolidayRepository {

    private static volatile HolidayRepository holidayRepositoryInstance = null;

    public static HolidayRepository getHolidayRepositoryInstance() {
        if (Objects.isNull(holidayRepositoryInstance)) {
            synchronized (HolidayRepository.class) {
                if (Objects.isNull(holidayRepositoryInstance)) {
                    holidayRepositoryInstance = new HolidayRepository();
                }
            }
        }
        return holidayRepositoryInstance;
    }

    public final List<Holiday> availableHolidays = new ArrayList<>();

    public HolidayRepository() {
        Holiday holidayBucharest = Holiday.builder()
                .destination(Destination.builder().city(City.BUCHAREST).neighbourhood(Neighbourhood.OLD_TOWN_BUCHAREST).region(Region.MUNTENIA).build())
                .period(Period.ofDays(2))
                .build();
        Holiday holidayBrasov = Holiday.builder()
                .destination(Destination.builder().city(City.BRASOV).neighbourhood(Neighbourhood.BRASOV_HISTORICAL_CENTER).region(Region.TRANSILVANIA).build())
                .period(Period.ofDays(7))
                .build();

        availableHolidays.add(holidayBucharest);
        availableHolidays.add(holidayBrasov);
    }
}
