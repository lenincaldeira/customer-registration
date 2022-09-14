package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import services.CustomerService;

import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;

@RestController
@RequestMapping
public class CustomerController {
    @Autowired
    private CustomerService service;
    private ResponseEntity<String> QName;

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestParam(name = "file", required = true) MultipartFile file, @PathVariable("id") Integer id, HttpServletResponse response) throws Exception {
        return QName;
    }

}
