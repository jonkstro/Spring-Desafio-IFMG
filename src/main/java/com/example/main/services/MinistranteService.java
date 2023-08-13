package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Ministrante;
import com.example.main.repositories.MinistranteRepository;

@Service
public class MinistranteService {
    @Autowired
    MinistranteRepository repository;

    public List<Ministrante> findAll() {
        return repository.findAll();
    }

    public Optional<Ministrante> findById(Integer id) {
        return repository.findById(id);
    }

    public Ministrante create(Ministrante obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Ministrante update(Integer id, Ministrante obj) {
        Ministrante entity = updateData(id, obj);
        
        return repository.save(entity);
    }

    private Ministrante updateData(Integer id, Ministrante obj) {
        Ministrante entity = repository.getReferenceById(id);
        entity.setDisciplina(obj.getDisciplina());
        entity.setProfessor(obj.getProfessor());
        return entity;
    }
}
