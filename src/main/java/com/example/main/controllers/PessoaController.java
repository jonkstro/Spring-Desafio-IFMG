package com.example.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.models.Pessoa;
import com.example.main.services.PessoaService;

@RestController
@RequestMapping(value = "/api/escola/pessoas")
public class PessoaController {
    @Autowired
    PessoaService service;
    
    @GetMapping
    public ResponseEntity <List<Pessoa>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }
    
}
