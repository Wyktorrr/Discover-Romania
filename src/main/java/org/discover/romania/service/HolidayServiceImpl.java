package org.discover.romania.service;

import org.discover.romania.domain.BashHoliday;
import org.discover.romania.repository.HolidayRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService {
    private static final HolidayRepository holidayRepository = HolidayRepository.getHolidayRepositoryInstance();

//    @Autowired
//    private Experience experience;

    public BashHoliday createAndFetchHoliday(String cityName) {

        //fix this -- tips and stories should be populated from Experience (perhaps add duration, likes, save functionality for tourists)
        return BashHoliday.builder()
                .holidayItems(
                        holidayRepository.getAvailableHolidays().stream()
                                .filter(h -> h.getDestination().getCity().getCityName().equalsIgnoreCase(cityName))
                                .map(p -> BashHoliday.HolidayItem.builder()
                                        .city(cityName)
                                        .price(100L) //Hard coded
//                                        .descriptionOfHolidayItem(experience.getDescription())
//                                        .tips(experience.getTips())
//                                        .stories(experience.getStories())
                                        .descriptionOfHolidayItem("Nice city!")
                                        .tips(List.of("Have fun!", "Night life", "Drink a lot!"))  //Hard coded!!
                                        .stories(List.of("Great vibe, best capital ever!"))    //Hard coded as well
                                        .build())
                                .sorted()
                                .toList())
                .createdAt(new Date())
                .lastUpdatedAt(new Date())
                .validUntil(Date.from(Instant.now().plus(2, ChronoUnit.DAYS)))
                .build();
    }
}
