package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Professor;
import com.example.main.repositories.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository repository;

    public List<Professor> findAll() {
        return repository.findAll();
    }

    public Optional<Professor> findById(Integer id) {
        return repository.findById(id);
    }

    public Professor create(Professor obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Professor update(Integer id, Professor obj) {
        Professor entity = updateData(id, obj);
        
        return repository.save(entity);
    }

    private Professor updateData(Integer id, Professor obj) {
        Professor entity = repository.getReferenceById(id);
        entity.setDataContratacao(obj.getDataContratacao());
        entity.setIsDedicacaoExclusiva(obj.getIsDedicacaoExclusiva());
        entity.setNumeroFuncionario(obj.getNumeroFuncionario());
        return entity;
    }
}
