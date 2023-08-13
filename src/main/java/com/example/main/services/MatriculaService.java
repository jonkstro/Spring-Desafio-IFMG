package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Matricula;
import com.example.main.repositories.MatriculaRepository;

@Service
public class MatriculaService {
    @Autowired
    MatriculaRepository repository;

    public List<Matricula> findAll() {
        return repository.findAll();
    }

    public Optional<Matricula> findById(Integer id) {
        return repository.findById(id);
    }

    public Matricula create(Matricula obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Matricula update(Integer id, Matricula obj) {
        Matricula entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Matricula updateData(Integer id, Matricula obj) {
        Matricula entity = repository.getReferenceById(id);
        entity.setAluno(obj.getAluno());
        entity.setTurma(obj.getTurma());

        return entity;
    }
}
