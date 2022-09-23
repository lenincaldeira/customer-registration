package com.customer.registration.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Data
@Entity
public class Customer {
    @Id
    private Integer id;
    private String name;
    private Date birthDate;
    private String email;
    private String document;
    @Embedded
    private Adress adress;
    private String phoneNumber;
    @Lob
    private byte[] photo;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", document='" + document + '\'' +
                //", adresses=" + adresses +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photo=" + photo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer that)) return false;
        return getDocument().equals(that.getDocument());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocument());
    }
}
