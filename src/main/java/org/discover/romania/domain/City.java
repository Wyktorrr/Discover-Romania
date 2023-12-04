package org.discover.romania.domain;

public enum City {
    BUCHAREST("Bucharest"),
    BRASOV("Brasov");

    public final String city_name;

    private City(String city_name) {
        this.city_name = city_name;
    }
}
