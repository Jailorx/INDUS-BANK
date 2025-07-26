package com.bank.IndusBank.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/v1/notices")
    public String getNotices(){
        return "Welcome to Notices Page";
    }
}
