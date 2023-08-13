package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    
}
