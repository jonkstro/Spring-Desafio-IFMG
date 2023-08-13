package com.example.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.models.Grade;
import com.example.main.services.GradeService;

@RestController
@RequestMapping(value = "/api/escola/grades")
public class GradeController {
    @Autowired
    GradeService service;

    @GetMapping
    public ResponseEntity<List<Grade>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Grade>> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Grade> create(@RequestBody Grade obj) {
        return ResponseEntity.ok().body(service.create(obj));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grade> update(@PathVariable Integer id, @RequestBody Grade obj) {
        return ResponseEntity.ok().body(service.update(id, obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
