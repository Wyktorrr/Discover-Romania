package org.discover.romania;


import org.discover.romania.domain.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.discover.romania.domain.City.BRASOV;
import static org.discover.romania.domain.Region.TRANSILVANIA;

public class Main {


    //private static final DestinationRepository destinationRepository = new DestinationRepository();
    //private static final List<Destination> destinationTest = DestinationRepository.availableDestination.stream().filter(region -> region.equals(TRANSILVANIA)).filter(city -> city.equals(BRASOV)).collect(Collectors.toList());
    //private static final HolidayRepository holidayRepository = new HolidayRepository(destinationTest);
    private static final HolidayService holidayService = new HolidayService();




    public static void main(String[] args) {
        System.out.println("---Welcome to Discover Romania Service!---");

        Traveler traveler1 = Traveler.builder().name("Victor").email("testVic@email.com").telephoneNumber("07358888").build();
        BookService.addTraveler(traveler1);

        BashHoliday bashHoliday = holidayService.createHoliday();
        System.out.println(bashHoliday);

    }
}