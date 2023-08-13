package com.example.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.main.models.Ministrante;

@Repository
public interface MinistranteRepository extends JpaRepository<Ministrante, Integer> {
    
}
