package org.discover.romania.controller;

import org.discover.romania.config.UriConstants;
import org.discover.romania.domain.BashHoliday;
import org.discover.romania.service.HolidayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holiday")
public class HolidayController {

    @Autowired
    private HolidayServiceImpl holidayServiceImpl;

    @GetMapping(value = UriConstants.HOLIDAY_DETAILS, produces = "application/json")
    public BashHoliday getAllCreatedHolidays(@RequestParam(value = "city", required = true) String city) {
        return holidayServiceImpl.createAndFetchHoliday(city);
    }
}
