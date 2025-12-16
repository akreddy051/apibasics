package com.example.apibasics.controller;

import com.example.apibasics.entity.Account;
import com.example.apibasics.service.UPIServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/basic")
public class UPIController {

    @Autowired
    private UPIServiceInterface upiServiceInterface;

    @PostMapping
    public String createAccount(@RequestBody Account account) {
        return upiServiceInterface.createAccountService(account);
    }

    @GetMapping("/{email}")
    public Account viewAccount(@PathVariable("email") String email) {
        return upiServiceInterface.viewAccountService(email);
    }

    @PutMapping("/{email}")
    public String updateAccount(@PathVariable("email") String email, @RequestBody Account account) {
        return upiServiceInterface.updateAccountService(email,account);
    }

    @DeleteMapping("/{email}")
    public String deleteAccount(@PathVariable("email") String email) {
        return upiServiceInterface.deleteAccountService(email);
    }
}
