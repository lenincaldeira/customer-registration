package com.customer.registration.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date birthDate;
    private String email;
    private String document;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_adress")
    private List<Adress> adresses;
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
                ", adresses=" + adresses +
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
