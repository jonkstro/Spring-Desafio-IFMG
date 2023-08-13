package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
    
}
