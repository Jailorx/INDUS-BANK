package com.bank.IndusBank.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/v1/contact")
    public String getContactDetails(){
        return "Welcome to Contact Page";
    }
}
