package org.discover.romania.domain;

import lombok.Data;

import java.util.List;

@Data
public abstract class Experience {
    protected String description;
    protected List<String> tips;
    protected List<String> stories;

    public abstract String getExperienceDescription();
}
