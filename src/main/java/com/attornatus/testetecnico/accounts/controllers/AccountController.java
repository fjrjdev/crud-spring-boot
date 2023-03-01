package com.attornatus.testetecnico.accounts.controllers;

import com.attornatus.testetecnico.accounts.services.AccountService;
import com.attornatus.testetecnico.accounts.services.dto.AccountDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public ResponseEntity<ArrayList<Object>> getAllAccounts() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.findAllAccounts());
    }

    @PostMapping()
    public ResponseEntity<AccountDTO> registerAccount(@RequestBody AccountDTO accountDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.saveAccount(accountDTO));
    }

}