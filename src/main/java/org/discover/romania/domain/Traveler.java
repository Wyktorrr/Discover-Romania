package org.discover.romania.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Traveler {
    private String name;
    private String email; // validation using regular expressions needed
    private String telephoneNumber; //further necessary validations
    private String motherTongue;

    public Traveler(String name, String email, String telephoneNumber, String motherTongue) {
        this.name = name;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.motherTongue = motherTongue;
    }
}
