package com.example.apibasics.dao;

import com.example.apibasics.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UPIDAOInterface extends JpaRepository<Account,String> {
}
