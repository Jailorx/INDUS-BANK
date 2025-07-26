package com.bank.IndusBank.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/v1/cards")
    public String getCardDetails(){
        return "Your All Cards Details: ______";
    }
}
