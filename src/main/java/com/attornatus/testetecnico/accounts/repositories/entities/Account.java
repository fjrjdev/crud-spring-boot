package com.attornatus.testetecnico.accounts.repositories.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "account")
public class Account {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "birthDate")
    private String birthDate;

    public Account(){ this.id = UUID.randomUUID().toString();}

    public void setName(String name) {
    }

    public void setBirthDate(String birthDate) {
    }
}
