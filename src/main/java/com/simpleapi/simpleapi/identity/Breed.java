package com.simpleapi.simpleapi.identity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@Embeddable
public class Breed {

    private String breed;

    public Breed() {

    }
}
