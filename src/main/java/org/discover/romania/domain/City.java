package org.discover.romania.domain;

import lombok.Getter;

@Getter
public enum City {

    BUCHAREST("Bucharest", "B"),
    BRASOV("Brasov", "BV");

    City(String cityName, String cityId) {
        this.cityName = cityName;
        this.cityId = cityId;
    }

    private final String cityName;
    private final String cityId;
}
