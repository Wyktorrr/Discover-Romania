package org.discover.romania.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.Period;

@Getter
@Setter
public class Destination extends Experience{

    private Region region;
    private City city;
    private Neighbourhood neighbourhood;

    @Builder
    public Destination(Region region, City city, Neighbourhood neighbourhood) {
        super();
        this.region = region;
        this.city = city;
        this.neighbourhood = neighbourhood;
    }
}
