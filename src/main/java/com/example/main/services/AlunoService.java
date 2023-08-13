package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Aluno;
import com.example.main.repositories.AlunoRepository;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository repository;

    public List<Aluno> findAll() {
        return repository.findAll();
    }

    public Optional<Aluno> findById(Integer id) {
        return repository.findById(id);
    }

    public Aluno create(Aluno obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Aluno update(Integer id, Aluno obj) {
        Aluno entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Aluno updateData(Integer id, Aluno obj) {
        Aluno entity = repository.getReferenceById(id);
        entity.setDataMatricula(obj.getDataMatricula());
        entity.setIsEspecial(obj.getIsEspecial());
        entity.setNumeroMatricula(obj.getNumeroMatricula());
        return entity;
    }
}
