package com.attornatus.testetecnico.addresses.repositories.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "address")
public class Address {
    @Id
    private String id;
    private String street;
    private String zipcode;
    private int number;

    private  String city;
    private Boolean mainAddress;
    public Address(){
        this.id = UUID.randomUUID().toString();
    }
}
