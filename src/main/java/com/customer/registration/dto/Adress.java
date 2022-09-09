package com.customer.registration.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class Adress {

    private long id;
    private String publicPlace;
    private int number;
    private String complement;
    private String district;
    private String postalCode;
    private String city;
    private String state;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress adressDTO)) return false;
        return getId() == adressDTO.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
