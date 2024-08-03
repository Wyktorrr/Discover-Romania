package org.discover.romania;

import org.discover.romania.domain.BashBooking;
import org.discover.romania.domain.BashHoliday;
import org.discover.romania.domain.Language;
import org.discover.romania.domain.Traveler;
import org.discover.romania.repository.DestinationRepository;
import org.discover.romania.service.BookServiceImpl;
import org.discover.romania.service.HolidayServiceImpl;
import org.discover.romania.validations.ValidateLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static java.lang.String.format;
import static org.discover.romania.domain.City.BUCHAREST;

@SpringBootApplication
public class Main {
    private static final HolidayServiceImpl holidayService = new HolidayServiceImpl();
    private static final BookServiceImpl bookService = new BookServiceImpl();
    private static final DestinationRepository destinationRepository = DestinationRepository.getDestinationRepositoryInstance();

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Main.class, args);

        System.out.println("---Welcome to Discover Romania!---");
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(format("Enter a value for the preferred language out of the following: %s", Stream.of(Language.values()).map(Language::getLanguageName).toList()));

        // Reading data using readLine
        String motherTongue = reader.readLine();
        String motherTongueTrimmed = motherTongue.trim();

        ValidateLanguage.isValidLanguage(motherTongueTrimmed);
        Traveler traveler1 = Traveler.builder()
                .name("Victor").email("testVic@email.com").telephoneNumber("07358888").motherTongue(motherTongueTrimmed)
                .build();
        new BookServiceImpl().addTraveler(traveler1);

        System.out.println("Available destinations:");
        System.out.println(destinationRepository.listAvailableDestinations());
        BashBooking bashBooking = bookService.createAndFetchBooking(traveler1.getEmail());
        BashHoliday bashHoliday = holidayService.createAndFetchHoliday(BUCHAREST.getCityName());
        System.out.println("Booking:");
        System.out.println(bashBooking);
        System.out.println("Your holiday:");
        System.out.println(bashHoliday);
    }
}