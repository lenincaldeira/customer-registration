package com.customer.registration.dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
@Data
public class CustomerDTO implements Serializable {
    @ApiParam(required = true)
    private Integer id;
    @ApiParam(required = true)
    private String name;
    @ApiParam(required = true)
    private Date birthDate;
    @ApiParam(required = true)
    private String email;
    @ApiParam(required = true)
    private String document;
    @ApiParam(required = true)
    private AdressDTO adress;
    @ApiParam(required = true)
    private String phoneNumber;
    @ApiParam(required = false)
    private MultipartFile photo;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", document='" + document + '\'' +
                ", adresses=" + adress +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photo=" + photo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDTO that)) return false;
        return getDocument().equals(that.getDocument());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocument());
    }
}
