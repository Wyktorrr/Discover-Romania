package org.discover.romania;

import org.discover.romania.domain.Traveler;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private static final List<Traveler> travelers = new ArrayList<>();

    public void addCustomer(Traveler traveler) {
        travelers.add(traveler);
    }
}
