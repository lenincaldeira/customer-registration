package com.customer.registration.dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.Objects;

@Data
public class AdressDTO {

    @ApiParam(required = true)
    private long id;
    @ApiParam(required = true)
    private String publicPlace;
    @ApiParam(required = true)
    private int houseNumber;
    @ApiParam(required = true)
    private String complement;
    @ApiParam(required = true)
    private String district;
    @ApiParam(required = true)
    private String postalCode;
    @ApiParam(required = true)
    private String city;
    @ApiParam(required = true)
    private String state;

    @Override
    public String toString() {
        return "AdressDTO{" +
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
        if (!(o instanceof AdressDTO adressDTO)) return false;
        return getId() == adressDTO.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
