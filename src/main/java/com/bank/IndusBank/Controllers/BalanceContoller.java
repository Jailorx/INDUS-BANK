package com.bank.IndusBank.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceContoller {

    @GetMapping("/v1/balance")
    public String getBalanceDetails(){
        return "Balance is Rs.100000";
    }
}
