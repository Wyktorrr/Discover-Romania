package org.discover.romania.domain;

import lombok.Getter;

import java.util.List;

@Getter
public enum Neighbourhood {
    OLD_TOWN_BUCHAREST("Old Town Bucharest", List.of("night life", "history")),
    BRASOV_HISTORICAL_CENTER("Brasov Historical Center", List.of("history"));

    public final String neighbourhood;
    public final List<String> attractionsList;

    Neighbourhood(String neighbourhood, List<String> attractionsList) {
        this.neighbourhood = neighbourhood;
        this.attractionsList = attractionsList;
    }
}
