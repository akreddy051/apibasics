package com.example.apibasics.service;

import com.example.apibasics.entity.Account;

public interface UPIServiceInterface {

    String createAccountService(Account account);

    Account viewAccountService(String email);

    String updateAccountService(String email, Account account);

    String deleteAccountService(String email);
}
