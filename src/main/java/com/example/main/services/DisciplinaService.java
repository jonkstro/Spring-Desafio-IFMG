package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Disciplina;
import com.example.main.repositories.DisciplinaRepository;

@Service
public class DisciplinaService {
    @Autowired
    DisciplinaRepository repository;

    public List<Disciplina> findAll() {
        return repository.findAll();
    }

    public Optional<Disciplina> findById(Integer id) {
        return repository.findById(id);
    }

    public Disciplina create(Disciplina obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Disciplina update(Integer id, Disciplina obj) {
        Disciplina entity = updateData(id, obj);
        
        return repository.save(entity);
    }

    private Disciplina updateData(Integer id, Disciplina obj) {
        Disciplina entity = repository.getReferenceById(id);
        entity.setCargaHoraria(obj.getCargaHoraria());
        entity.setCodigoDisciplina(obj.getCodigoDisciplina());
        entity.setEmenta(obj.getEmenta());
        entity.setNome(obj.getNome());  
        entity.setPorcentagemPratica(obj.getPorcentagemPratica());
        entity.setPorcentagemTeoria(obj.getPorcentagemTeoria());
        entity.setStatus(obj.getStatus());
        return entity;
    }
}
