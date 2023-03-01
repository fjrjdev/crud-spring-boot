package com.attornatus.testetecnico.addresses.controllers;


import com.attornatus.testetecnico.accounts.repositories.entities.Account;

import com.attornatus.testetecnico.addresses.repositories.AddressRepository;
import com.attornatus.testetecnico.addresses.repositories.entities.Address;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressRepository repository;

    AddressController(AddressRepository repository) {
        this.repository = repository;
    }
    @GetMapping()
    public List<Address> getAllAddresses() {
        return repository.findAll();
    }

    @PostMapping()
    public ResponseEntity<Address> newAddress(@RequestBody Address newAddress){
        Address savedAddress = repository.save(newAddress);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(savedAddress);
    }
}
