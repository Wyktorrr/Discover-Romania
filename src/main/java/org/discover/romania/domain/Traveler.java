package org.discover.romania.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Traveler {
    private String name;
    private String email; // validation using regular expressions needed
    private String telephoneNumber; //further necessary validations
}
