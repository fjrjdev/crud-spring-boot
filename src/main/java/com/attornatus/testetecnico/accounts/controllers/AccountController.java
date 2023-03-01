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

    @GetMapping()
    public ResponseEntity<ArrayList<Object>> getAllAccounts() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.findAllAccounts());
    }
    @GetMapping("/{id}")
    public  ResponseEntity<AccountDTO> getAccountById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(accountService.findAccountById(id));

    }
    @PostMapping()
    public ResponseEntity<AccountDTO> registerAccount(@RequestBody AccountDTO accountDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(accountService.saveAccount(accountDTO));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<AccountDTO> updateAccount(@PathVariable Long id, @RequestBody AccountDTO accountDTO) {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.updateAccount(id, accountDTO));
    }

}