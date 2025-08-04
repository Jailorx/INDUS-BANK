package com.bank.IndusBank.controller;

import com.bank.IndusBank.model.Customer;
import com.bank.IndusBank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Customer customer){
        try{
            String hashedPwd=passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashedPwd);
            Customer newCustomer=customerRepository.save(customer);
            if(newCustomer.getId()>0)
                return ResponseEntity.status(HttpStatus.CREATED)
                        .body("User Created Successfully");
            else
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Unable To Create New User");
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(ex.getMessage());
        }
    }
}
