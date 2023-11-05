package org.discover.romania.domain;

import lombok.*;

import java.util.Date;
import java.util.List;


@Builder
@Data
public class BashHoliday {
    private List<HolidayItems> items;
    private Date createdAt;
    private Date validUntil;
    private Date lastUpdatedAt;


    @Builder
    @ToString
    @Getter
    @Setter
    public static final class HolidayItems implements Comparable {

        private String description;
        private Long price;

        @Override
        public int compareTo(Object o) {
            return description.compareTo(((HolidayItems) o).description);
        }
    }
}
