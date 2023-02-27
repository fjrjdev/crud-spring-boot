package com.attornatus.testetecnico.enderecos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {
    @GetMapping()
    public String obterEnderecos(){
        return "Hello";
    }
}
