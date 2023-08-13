package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Grade;
import com.example.main.repositories.GradeRepository;

@Service
public class GradeService {
    @Autowired
    GradeRepository repository;

    public List<Grade> findAll() {
        return repository.findAll();
    }

    public Optional<Grade> findById(Integer id) {
        return repository.findById(id);
    }

    public Grade create(Grade obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Grade update(Integer id, Grade obj) {
        Grade entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Grade updateData(Integer id, Grade obj) {
        Grade entity = repository.getReferenceById(id);
        entity.setMinistrante(obj.getMinistrante());
        entity.setTurma(obj.getTurma());

        return entity;
    }
}
