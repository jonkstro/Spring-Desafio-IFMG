package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Curso;
import com.example.main.repositories.CursoRepository;

@Service
public class CursoService {
    @Autowired
    CursoRepository repository;

    public List<Curso> findAll() {
        return repository.findAll();
    }

    public Optional<Curso> findById(Integer id) {
        return repository.findById(id);
    }

    public Curso create(Curso obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Curso update(Integer id, Curso obj) {
        Curso entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Curso updateData(Integer id, Curso obj) {
        Curso entity = repository.getReferenceById(id);
        entity.setCategoria(obj.getCategoria());
        entity.setDataCriacao(obj.getDataCriacao());
        entity.setNome(obj.getNome());
        entity.setStatus(obj.getStatus());

        return entity;
    }
}
