package org.discover.romania;


import org.discover.romania.domain.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.discover.romania.domain.City.BRASOV;
import static org.discover.romania.domain.Region.TRANSILVANIA;

public class Main {
    public static void main(String[] args) {
        System.out.print("---Welcome to Discover Romania Service!---");

        DestinationRepository destinationRepository = new DestinationRepository();

        List<Destination> destinationTest = DestinationRepository.availableDestination.stream().filter(region -> region.equals(TRANSILVANIA)).filter(city -> city.equals(BRASOV)).collect(Collectors.toList());
        HolidayRepository holidayRepository = new HolidayRepository(destinationTest);
    }
}