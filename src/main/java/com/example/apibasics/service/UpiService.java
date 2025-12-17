package com.example.apibasics.service;

import com.example.apibasics.dao.UPIDAOInterface;
import com.example.apibasics.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpiService implements UPIServiceInterface {
    @Autowired
    UPIDAOInterface upidaoInterface;

    @Override
    public String createAccountService(Account account) {
        upidaoInterface.save(account);
        return "Account Created Successfully";
    }

    @Override
    public Account viewAccountService(String email) {
        return upidaoInterface.findById(email).orElseThrow(() -> new RuntimeException("Account not found"));
    }

    @Override
    public String updateAccountService(String email, Account account) {
        boolean isEmailPresent = upidaoInterface.findById(email).isPresent();
        if(isEmailPresent){
            upidaoInterface.save(account);
            return "Account Updated Successfully";
        }else{
            return "Account Not Found";
        }
    }

    @Override
    public String deleteAccountService(String email) {
        upidaoInterface.deleteById(email);
        return "Account Deleted Successfully";
    }
}
