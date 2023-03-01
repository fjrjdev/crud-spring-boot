package com.attornatus.testetecnico.accounts.services.dto;

import com.attornatus.testetecnico.accounts.repositories.entities.Account;

import java.util.UUID;

public class AccountDTO {

    private UUID id;
    private String name;
    private String birthDate;

    public AccountDTO (){}

    public AccountDTO(Account account){
        this.id = account.getId();
        this.name = account.getName();
        this.birthDate = account.getBirthDate();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
