package org.discover.romania.domain;

import lombok.*;

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
        private String travelerName;
        private String travelerEmail;
        private String preferredLanguage;
        private String destination;

        @Override
        public int compareTo(Object o) {
            return travelerName.compareTo(((BookingItems) o).travelerName);
        }
    }
}
