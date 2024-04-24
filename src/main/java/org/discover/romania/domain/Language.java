package org.discover.romania.domain;

import lombok.Getter;

@Getter
public enum Language {
    ROMANIAN("Romanian", "ro"),
    ENGLISH("English", "en"),
    FRENCH("French", "fr");

    Language(String languageName, String getLanguageId) {
        this.languageName = languageName;
        this.getLanguageId = getLanguageId;
    }

    private final String languageName;
    private final String getLanguageId;
}
