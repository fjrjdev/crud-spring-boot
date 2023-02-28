package com.attornatus.testetecnico.addresses.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addresses")
public class AddressesController {
    @Autowired
    private ObjectMapper mapper;
    @GetMapping()
    public ObjectNode getAddresses(){
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("nome", "Hello World");
        return objectNode;
    }
}
