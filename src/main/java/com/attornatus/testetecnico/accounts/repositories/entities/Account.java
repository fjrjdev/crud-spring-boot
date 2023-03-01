package com.attornatus.testetecnico.accounts.repositories.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "account")
public class Account {
    // TODO ALTERAR ID
    @Id
    @GeneratedValue(generator = "account_uuid_generator")
    @GenericGenerator(name = "account_uuid_generator", strategy = "uuid2")
    private UUID id;
    @Column(name = "name")
    private String name;
    // TODO ALTERAR TIPO CAMPO DE DATA LOCALDATETIME()
    @Column(name = "birthDate")
    private String birthDate;



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
