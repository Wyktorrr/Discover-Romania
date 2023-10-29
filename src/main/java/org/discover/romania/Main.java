package org.discover.romania;


import org.discover.romania.domain.*;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.discover.romania.domain.City.BRASOV;
import static org.discover.romania.domain.Neighbourhood.BRASOV_HISTORICAL_CENTER;
import static org.discover.romania.domain.Region.TRANSILVANIA;

public class Main {
    public static void main(String[] args) {
        System.out.print("---Welcome to Discover Romania Service!---");

        DestinationRepository destinationRepository = new DestinationRepository();

        List<Destination> destinationTest = DestinationRepository.availableDestination.stream().filter(region -> region.equals(TRANSILVANIA)).filter(city -> city.equals(BRASOV)).collect(Collectors.toList());
        HolidayRepository holidayRepository = new HolidayRepository(destinationTest);
    }

    public static class DestinationRepository {
        public static List<Destination> availableDestination = asList(Destination.builder().region(TRANSILVANIA).city(BRASOV).neighbourhood(BRASOV_HISTORICAL_CENTER).build(),
                Destination.builder().city(BRASOV).region(Region.DOBROGEA) //currently working like this bcs no validations are added
                .neighbourhood(Neighbourhood.BRASOV_HISTORICAL_CENTER).build());
        public List<Destination> listAvailableDestinations() {
            return availableDestination;
        }
    }
}