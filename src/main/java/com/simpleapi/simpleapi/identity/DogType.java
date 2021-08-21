package com.simpleapi.simpleapi.identity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "dog")
public class DogType implements Comparable<DogType>{

    public DogType() {
    }

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    Long id;

    private String name;

    @Embedded
    private Breed breed;

    @Override
    public int compareTo(DogType o) {
        return 0;
    }
}
