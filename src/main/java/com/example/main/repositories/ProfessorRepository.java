package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    
}
