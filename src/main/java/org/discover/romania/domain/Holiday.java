package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Period;
import java.util.List;

@Getter
@Setter
public class Holiday extends Experience{
    private Destination destination;
    private List<Destination> availableDestinations;
    private Period period;

    @Builder
    private Holiday(Destination destination, List<Destination> availableDestinations, Period period) {
        super();
        this.destination = destination;
        this.availableDestinations = availableDestinations;
        this.period = period;
    }

    @Override
    public String getExperienceDescription() {
        return String.format("Holiday %s", destination);
    }
}
