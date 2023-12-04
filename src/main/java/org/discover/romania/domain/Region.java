package org.discover.romania.domain;

public enum Region {
    MUNTENIA("Muntenia"),
    DOBROGEA("Dobrogea"),

    TRANSILVANIA("Transilvania");

    public final String region_description;

    private Region(String region_description) {
        this.region_description = region_description;
    }
}
