package com.attornatus.testetecnico.accounts.services;

import com.attornatus.testetecnico.accounts.repositories.AccountRepository;
import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Transactional
    public void saveAccount(Account account) {
        accountRepository.save(account);
    }


    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);
    }

}