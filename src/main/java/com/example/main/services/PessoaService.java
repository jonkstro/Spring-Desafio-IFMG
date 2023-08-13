package com.example.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.models.Pessoa;
import com.example.main.repositories.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository repository;

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Optional<Pessoa> findById(Integer id) {
        return repository.findById(id);
    }

    public Pessoa create(Pessoa obj) {
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Pessoa update(Integer id, Pessoa obj) {
        Pessoa entity = updateData(id, obj);

        return repository.save(entity);
    }

    private Pessoa updateData(Integer id, Pessoa obj) {
        Pessoa entity = repository.getReferenceById(id);
        entity.setCpf(obj.getCpf());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setEndereco(obj.getEndereco());
        entity.setNome(obj.getNome());
        entity.setTelefone(obj.getTelefone());
        return entity;
    }
}
