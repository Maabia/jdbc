package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TesteController {

    @GetMapping
    public String teste() {
        String nome = getString();
        return nome;
    }

    private String getString() {
        String nome = "Maabia";
        return nome;
    }
}


