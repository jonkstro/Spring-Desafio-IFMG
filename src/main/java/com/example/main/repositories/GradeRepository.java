package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {
    
}
