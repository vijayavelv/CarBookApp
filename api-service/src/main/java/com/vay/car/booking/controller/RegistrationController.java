package com.vay.car.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vay.car.booking.dto.RegistrationDTO;

@RestController
public class RegistrationController {


    @PostMapping("registration")
    public String addRegistration(@RequestBody RegistrationDTO registration) {
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
    
}
