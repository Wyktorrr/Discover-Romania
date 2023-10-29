package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Period;
import java.util.List;

@Getter
@Setter
public class Holiday extends Experience{
    private List<Destination> availableDestinations;

    @Builder
    private Holiday(List<Destination> availableDestinations) {
        super();
        this.availableDestinations = availableDestinations;
    }
    //private Period period;
}
