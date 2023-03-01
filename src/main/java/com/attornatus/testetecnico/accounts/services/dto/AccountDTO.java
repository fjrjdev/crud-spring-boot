package com.attornatus.testetecnico.accounts.services.dto;

import com.attornatus.testetecnico.accounts.repositories.entities.Account;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;


public class AccountDTO {

    private Long id;
    private String name;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private String birthday;

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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


}
