package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}
