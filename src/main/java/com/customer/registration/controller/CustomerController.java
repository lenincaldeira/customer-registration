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

@Api("Endpoint - custome")
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
// Save
    @ApiOperation(nickname = "customer-post", value = "insert user into the application")
    @PostMapping("/")
    public ResponseEntity<Long> saveCustomer(@RequestParam(name = "customer", required = true) CustomerDTO customerDTO, HttpServletResponse response) throws Exception {
        CustomerDTO customer = customerService.saveCustomer(customerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer.getId());
    }
// Delete
    @ApiOperation(nickname = "customer-post", value = "insert user into the application")
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable("id") long id)  throws Exception {
        customerService.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(HttpStatus.OK);
    }
// Update
    @ApiOperation(nickname = "usuario-patch", value = "Atualiza um usuario na aplicação")
    @PatchMapping("/")
    public ResponseEntity<HttpStatus> atualizar(@RequestParam(name = "usuario", required = true) CustomerDTO customerDTO)throws Exception {
        customerService.saveCustomer(customerDTO);
        return ResponseEntity.status(HttpStatus.OK).body(HttpStatus.OK);
    }
}
