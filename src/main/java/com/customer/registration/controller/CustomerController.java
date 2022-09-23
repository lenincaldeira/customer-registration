package com.customer.registration.controller;

import com.customer.registration.dto.CustomerDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.customer.registration.services.CustomerService;
import javax.servlet.http.HttpServletResponse;

@Api("Endpoint - customer")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
// Save
    @ApiOperation(nickname = "customer-post", value = "insert user into the application")
    @PostMapping("/")
    public ResponseEntity<Integer> saveCustomer(@RequestParam(name = "customer", required = true) CustomerDTO customerDTO, HttpServletResponse response) throws Exception {
        CustomerDTO customer = customerService.saveCustomer(customerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer.getId());
    }
// Delete
    @ApiOperation(nickname = "customer-delete", value = "delete user into the application")
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCustomer(@PathVariable("id") long id) throws Exception {
        customerService.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.OK);
    }
// Update
    @ApiOperation(nickname = "customer-patch", value = "update user into the application")
    @PatchMapping("/")
    public ResponseEntity<HttpStatus> updateCustomer(@RequestParam(name = "customer", required = true) CustomerDTO customerDTO) throws Exception {
        customerService.saveCustomer(customerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK);
    }
}
