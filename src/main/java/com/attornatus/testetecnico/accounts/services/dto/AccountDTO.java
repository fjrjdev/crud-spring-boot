package com.attornatus.testetecnico.accounts.services.dto;

import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;


public class AccountDTO {

    private Long id;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    public AccountDTO (){}

    public AccountDTO(Account account){
        this.id = account.getId();
        this.name = account.getName();
        this.birthday = account.getBirthday();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


}
