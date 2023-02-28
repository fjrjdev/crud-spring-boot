package com.attornatus.testetecnico.users.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private ObjectMapper mapper;
    @GetMapping()
    public ObjectNode getUsers(){
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("nome", "Users");
        return objectNode;
    }
}