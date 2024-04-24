package org.discover.romania.domain;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class BashHoliday {
    private List<HolidayItem> items;
    private Date createdAt;
    private Date validUntil;
    private Date lastUpdatedAt;


    @Builder
    @ToString
    @Getter
    @Setter
    public final static class HolidayItem implements Comparable {

        private Long price;
        private String descriptionOfHolidayItem;
        private String city;
        private List<String> tips;
        private List<String> stories;

        @Override
        public int compareTo(Object o) {
            return descriptionOfHolidayItem.compareTo(((HolidayItem) o).descriptionOfHolidayItem);
        }
    }
}
