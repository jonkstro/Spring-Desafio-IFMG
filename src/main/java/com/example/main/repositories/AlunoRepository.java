package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
