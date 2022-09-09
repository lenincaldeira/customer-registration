package com.customer.registration.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
public class CustomerDTO {

    private long id;
    private String name;
    private Date birthDate;
    private String email;
    private String document;
    private List<AdressDTO> adresses;
    private String phoneNumber;
    private MultipartFile photo;

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
