package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.models.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
