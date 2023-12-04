package org.discover.romania.domain;

import java.util.List;

public enum Neighbourhood {
    OLD_TOWN_BUCHAREST("Old Town Bucharest", List.of("night life", "history")),
    BRASOV_HISTORICAL_CENTER("Brasov Historical Center", List.of("history"));

    public final String neighbourhood;
    public final List<String> attractionsList;

    private Neighbourhood(String neighbourhood, List<String> attractionsList) {
        this.neighbourhood = neighbourhood;
        this.attractionsList = attractionsList;
    }
}
