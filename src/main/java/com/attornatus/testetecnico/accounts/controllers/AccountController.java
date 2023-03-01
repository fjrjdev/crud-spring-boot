package com.attornatus.testetecnico.accounts.controllers;

import com.attornatus.testetecnico.accounts.repositories.AccountRepository;
import com.attornatus.testetecnico.accounts.repositories.entities.Account;

import com.attornatus.testetecnico.accounts.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AccountController {
    private final AccountRepository repository;

    @Autowired
    private AccountService accountService;
    AccountController(AccountRepository repository) {
        this.repository = repository;
    }
    @GetMapping()
    public List<Account> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping()
    public ResponseEntity<?> registerAccount(@RequestBody Account account) {
        try {
            accountService.saveAccount(account);
            return ResponseEntity.ok(account);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}