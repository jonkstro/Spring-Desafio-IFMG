package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Turma;
import com.example.main.repositories.TurmaRepository;

@Service
public class TurmaService {
    @Autowired
    TurmaRepository repository;

    public List<Turma> findAll() {
        return repository.findAll();
    }

    public Optional<Turma> findById(Integer id) {
        return repository.findById(id);
    }

    public Turma create(Turma obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Turma update(Integer id, Turma obj) {
        Turma entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Turma updateData(Integer id, Turma obj) {
        Turma entity = repository.getReferenceById(id);
        entity.setCurso(obj.getCurso());
        entity.setDataFim(obj.getDataFim());
        entity.setDataInicio(obj.getDataInicio());
        entity.setHorario(obj.getHorario());
        entity.setLocal(obj.getLocal());
        entity.setNome(obj.getNome());
        entity.setStatus(obj.getStatus());

        return entity;
    }
}
