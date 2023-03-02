package com.attornatus.testetecnico.accounts.services;

import com.attornatus.testetecnico.accounts.repositories.AccountRepository;
import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import com.attornatus.testetecnico.accounts.services.dto.AccountDTO;
import com.attornatus.testetecnico.exceptiions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


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

    public AccountDTO findAccountById(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            return new AccountDTO(account.get());
        }
        throw new ResourceNotFoundException("Account not found with id: " + id);
    }

    public AccountDTO updateAccount(Long id, AccountDTO accountDTO) {

        var account  = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Account not found with id: " + id));
        if (accountDTO.getName() != null) {
            account.setName(accountDTO.getName());
        }
        if(accountDTO.getBirthday() != null){
            account.setBirthday(accountDTO.getBirthday());
        }

        Account updatedAccount = accountRepository.save(account);

        return new AccountDTO(updatedAccount);
    }
}