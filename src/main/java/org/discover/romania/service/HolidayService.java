package org.discover.romania.service;

import org.discover.romania.domain.BashHoliday;

public interface HolidayService {
    BashHoliday createAndFetchHoliday(String cityName);
}
