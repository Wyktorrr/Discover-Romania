package org.discover.romania.service;

import org.discover.romania.domain.BashBooking;
import org.discover.romania.domain.Traveler;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    void addTraveler(Traveler traveler);

    BashBooking createAndFetchBooking(String email);
}
