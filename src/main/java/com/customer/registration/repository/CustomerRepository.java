package com.customer.registration.repository;

import com.customer.registration.dto.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
