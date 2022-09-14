package com.customer.registration.services;

import com.customer.registration.dto.Customer;
import com.customer.registration.dto.CustomerDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.customer.registration.repository.CustomerRepository;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customer, customerDTO);
        Customer customerReturn = customerRepository.save(customer);
        BeanUtils.copyProperties(customerDTO, customerReturn);
        return customerDTO;
    }

    public Optional<Customer> search(long id) {
        return customerRepository.findById(id);
    }

    public void deleteCustomer(long id){
        customerRepository.deleteById(id);
    }


}

