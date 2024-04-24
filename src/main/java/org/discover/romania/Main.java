package org.discover.romania;

import org.discover.romania.domain.BashBooking;
import org.discover.romania.domain.BashHoliday;
import org.discover.romania.domain.Language;
import org.discover.romania.domain.Traveler;
import org.discover.romania.repository.DestinationRepository;
import org.discover.romania.service.BookService;
import org.discover.romania.service.HolidayService;
import org.discover.romania.validations.ValidateLanguage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;
import static org.discover.romania.domain.City.BUCHAREST;

public class Main {
    private static final HolidayService holidayService = new HolidayService();
    private static final BookService bookService = new BookService();
    private static final DestinationRepository destinationRepository = DestinationRepository.getDestinationRepositoryInstance();

    public static void main(String[] args) throws IOException {
        System.out.println("---Welcome to Discover Romania!---");
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf(format("Enter a value for the preferred language out of the following: %s", Stream.of(Language.values()).map(Language::getLanguageName).collect(Collectors.toList())));

        // Reading data using readLine
        String motherTongue = reader.readLine();
        String motherTongueTrimmed = motherTongue.trim();

        ValidateLanguage.isValidLanguage(motherTongueTrimmed);
        Traveler traveler1 = Traveler.builder()
                .name("Victor").email("testVic@email.com").telephoneNumber("07358888").motherTongue(motherTongueTrimmed)
                .build();
        BookService.addTraveler(traveler1);

        System.out.println("Available destinations:");
        System.out.println(destinationRepository.listAvailableDestinations());
        BashBooking bashBooking = bookService.createBooking(traveler1.getEmail());
        BashHoliday bashHoliday = holidayService.createHoliday(BUCHAREST.getCityName());
        System.out.println("Booking:");
        System.out.println(bashBooking);
        System.out.println("Your holiday:");
        System.out.println(bashHoliday);
    }
}