package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Period;
import java.util.List;

@Getter
@Setter
public class Holiday extends Experience {
    private Destination destination;
    private List<Destination> availableDestinations;
    private List<String> tips;
    private Period period;

    @Builder
    private Holiday(Destination destination, List<Destination> availableDestinations, List<String> tips, Period period) {
        super();
        this.destination = destination;
        this.availableDestinations = availableDestinations;
        this.tips = tips;
        this.period = period;
    }

    @Override
    public String getDescription() {
        return String.format("Holiday %s", destination);
    }

    @Override
    public List<String> getTips() {
        return tips;
    }
}
