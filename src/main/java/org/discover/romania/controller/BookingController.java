package org.discover.romania.controller;

import org.discover.romania.config.UriConstants;
import org.discover.romania.domain.BashBooking;
import org.discover.romania.service.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @GetMapping(value = UriConstants.BOOKING_DETAILS, produces = "application/json")
    public BashBooking getAllAvailableBookings(@RequestParam(value = "userEmail", required = true) String email) {
        return bookServiceImpl.createAndFetchBooking(email);
    }
}
