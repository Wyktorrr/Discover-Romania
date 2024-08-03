package org.discover.romania.domain;

import lombok.*;

import java.util.Date;
import java.util.List;

@Builder
@Data
public class BashHoliday {
    private List<HolidayItem> holidayItems;
    private Date createdAt;
    private Date validUntil;
    private Date lastUpdatedAt;


    @Builder
    @ToString
    @Getter
    @Setter
    public static final class HolidayItem implements Comparable<HolidayItem> {

        private Long price;
        private String descriptionOfHolidayItem;
        private String city;
        private List<String> tips;
        private List<String> stories;

        @Override
        public int compareTo(HolidayItem holidayItem) {
            return descriptionOfHolidayItem.compareTo(holidayItem.descriptionOfHolidayItem);
        }
    }
}
