package com.attornatus.testetecnico.accounts.services;

import com.attornatus.testetecnico.accounts.repositories.AccountRepository;
import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import com.attornatus.testetecnico.accounts.services.dto.AccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountDTO saveAccount(AccountDTO accountDTO ) {
        var account = new Account();
        account.setName(accountDTO.getName());
        account.setBirthDate(accountDTO.getBirthDate());
        account = accountRepository.save(account);
        return new AccountDTO(account);
    }

    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);
    }

}