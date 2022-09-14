package com.customer.registration.dto;

import lombok.Data;

import java.util.Objects;

@Data
public class Adress {

    private long id;
    private String publicPlace;
    private int houseNumber;
    private String complement;
    private String district;
    private String postalCode;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", publicPlace='" + publicPlace + '\'' +
                ", number=" + houseNumber +
                ", complement='" + complement + '\'' +
                ", district='" + district + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress adress)) return false;
        Adress that = (Adress) o;
        return getId() == adress.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
