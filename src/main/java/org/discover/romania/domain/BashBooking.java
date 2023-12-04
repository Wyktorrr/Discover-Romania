package org.discover.romania.domain;

import lombok.*;

import java.time.Period;
import java.util.Date;
import java.util.List;

@Builder
@Data
public class BashBooking {
    private List<BookingItems> bookingItems;
    private Date createdAt;
    private Date validUntil;
    private Date lastUpdatedAt;

    @Builder
    @ToString
    @Getter
    @Setter
    public static final class BookingItems implements Comparable {

        private Destination destination;
        private Date date;
        private Period period;
        private Traveler traveler;


        @Override
        public int compareTo(Object o) {
            return traveler.toString().compareTo(String.valueOf(((BookingItems) o).traveler));
        }
    }
}
