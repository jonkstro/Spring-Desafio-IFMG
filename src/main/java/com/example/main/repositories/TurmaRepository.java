package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {
    
}
