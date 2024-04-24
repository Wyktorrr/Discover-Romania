package org.discover.romania.domain;

public enum Region {
    MUNTENIA("Muntenia", "muntenia"),
    DOBROGEA("Dobrogea", "dobrogea"),
    TRANSILVANIA("Transilvania", "transilvania");

    public final String regionDescription;
    public final String regionId;

    Region(String regionDescription, String regionId) {
        this.regionDescription = regionDescription;
        this.regionId = regionId;
    }
}
