package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attraction extends Experience {
    private String attractionName;
    private Destination destination;

    @Builder
    public Attraction(Destination destination) {
        super();
        this.destination = destination;
    }

    @Override
    public String getDescription() {
        return String.format("Attraction %s", attractionName);
    }
}
