package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.AdressService;

@RestController
@RequestMapping
public class AdressController {

    @Autowired
    private AdressService service;


}
