package org.discover.romania.service;

import org.discover.romania.domain.BashBooking;
import org.discover.romania.domain.Traveler;
import org.discover.romania.repository.DestinationRepository;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private static final List<Traveler> travelers = new ArrayList<>();

    public static void addTraveler(Traveler traveler) {
        travelers.add(traveler);
    }

    public static List<Traveler> getRegisteredTravelers() {
        return travelers;
    }

    private static final DestinationRepository destinationRepository = DestinationRepository.getDestinationRepositoryInstance();

    public BashBooking createBooking(String email) {
        return BashBooking.builder()
                .bookingItems(
                        BookService.getRegisteredTravelers().stream()
                                .filter(t -> t.getEmail().equalsIgnoreCase(email))
                                .map(t -> BashBooking.BookingItems.builder()
                                        .travelerName(t.getName())
                                        .travelerEmail(t.getEmail())
                                        .preferredLanguage(t.getMotherTongue())
                                        .destination(destinationRepository.listAvailableDestinations().toString())
                                        .build())
                                .sorted()
                                .collect(Collectors.toList()))
                .createdAt(new Date())
                .lastUpdatedAt(new Date())
                .validUntil(Date.from(Instant.now().plus(2, ChronoUnit.DAYS)))
                .build();
    }
}
