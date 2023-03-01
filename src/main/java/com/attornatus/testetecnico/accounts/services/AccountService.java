package com.attornatus.testetecnico.accounts.services;

import com.attornatus.testetecnico.accounts.repositories.AccountRepository;
import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import com.attornatus.testetecnico.accounts.services.dto.AccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public ArrayList<Object> findAllAccounts() {

        List<Account> accounts = accountRepository.findAll();

        var accountDTOS = new ArrayList<>();

        for (Account account : accounts) {
            AccountDTO accountDTO = new AccountDTO(account);
            accountDTOS.add(accountDTO);
        }
        return accountDTOS;
    }


    public AccountDTO saveAccount(AccountDTO accountDTO ) {
        var account = new Account();
        account.setName(accountDTO.getName());
        account.setBirthday(accountDTO.getBirthday());

        account = accountRepository.save(account);
        return new AccountDTO(account);
    }

    public Optional<Account> getAccountById(String id) {
        return accountRepository.findById(id);
    }

}