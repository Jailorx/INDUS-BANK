package com.bank.IndusBank.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/v1/loans")
    public String getLoansDetails(){
        return "All loans Details: ______";
    }
}
