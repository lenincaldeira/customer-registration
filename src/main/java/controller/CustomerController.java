package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import services.CustomerService;

@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestParam(name = "file", required = true))

}