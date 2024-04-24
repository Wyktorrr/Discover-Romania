package org.discover.romania.validations;

import org.discover.romania.domain.Language;

import java.util.stream.Stream;

import static java.lang.String.format;

public class ValidateLanguage {
    public static void isValidLanguage(String language) throws IllegalArgumentException{
        Stream.of(Language.values())
                .map(Language::getLanguageName)
                .filter(language::equalsIgnoreCase)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(format("Language value '%s' does not match any entry!", language)));
    }
}
