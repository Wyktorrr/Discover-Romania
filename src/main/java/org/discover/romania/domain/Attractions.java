package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attractions extends Experience{
    private Destination destination;

    @Builder
    public Attractions(Destination destination) {
        super();
        this.destination = destination;
    }
}
