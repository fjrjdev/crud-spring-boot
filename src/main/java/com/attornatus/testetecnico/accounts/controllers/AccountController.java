package com.attornatus.testetecnico.accounts.controllers;

import com.attornatus.testetecnico.accounts.services.AccountService;
import com.attornatus.testetecnico.accounts.services.dto.AccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /*@GetMapping()
    public List<Account> getAllUsers() {
        return repository.findAll();
    }*/

    @PostMapping()
    public ResponseEntity<AccountDTO> registerAccount(@RequestBody AccountDTO accountDTO) {
        return ResponseEntity.ok(accountService.saveAccount(accountDTO));
    }

}