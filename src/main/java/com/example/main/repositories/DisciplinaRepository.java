package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
    
}
