package org.discover.romania;

import org.discover.romania.domain.BashBooking;
import org.discover.romania.domain.BashHoliday;
import org.discover.romania.domain.Destination;
import org.discover.romania.domain.Traveler;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookService {
    private static final List<Traveler> travelers = new ArrayList<>();

    public static void addTraveler(Traveler traveler) {
        travelers.add(traveler);
    }

    public static  List<Traveler> getRegisteredTravelers() {
        return travelers;
    }

//    public BashHoliday createBooking() {
//
//
//        ///Fix this!!
//        return BashBooking.builder()
//                //.items(
////                        BookService.getRegisteredTravelers().stream()
////                                .filter(p -> BashBooking.BookingItems.builder()
////                                        .traveler(p.getEmail())
////                                .map(p -> BashBooking.BookingItems.builder()
////                                        .traveler(p.getEmail().toString())
////                                        .build())
////                                .sorted()
////                                .collect(Collectors.toList()))
//
//                .build();
//    }
}
