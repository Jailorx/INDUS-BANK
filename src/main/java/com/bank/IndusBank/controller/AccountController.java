package com.bank.IndusBank.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/v1/account")
    public String getAccountDetails(){
        return "Account Details: ______";
    }
}
