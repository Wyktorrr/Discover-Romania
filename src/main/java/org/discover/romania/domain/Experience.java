package org.discover.romania.domain;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public abstract class Experience {
    protected String description;
    protected List<String> tips;
    protected List<String> stories;
}
