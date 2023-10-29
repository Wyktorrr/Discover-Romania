package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attraction extends Experience{
    private String attraction;
    private Destination destination;

    @Builder
    public Attraction(Destination destination) {
        super();
        this.destination = destination;
    }

    @Override
    public String getExperienceDescription() {
        return String.format("Attraction %s", attraction);
    }
}
