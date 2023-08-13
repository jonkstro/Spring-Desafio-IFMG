package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    
}
