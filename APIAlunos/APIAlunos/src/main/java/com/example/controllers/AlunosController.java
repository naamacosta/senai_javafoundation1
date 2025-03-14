package com.example.controllers;

import com.example.models.Aluno;
import com.example.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/alunos")

public class AlunosController {
    private final AlunoService alunoService;

    @Autowired
    public AlunosController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> listar() {
        return alunoService.getAlunos();
    }

    @PostMapping
    public ResponseEntity<Aluno> cadastrar(@ResponseBody Aluno aluno) {
        return alunoService.createAluno(aluno);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Aluno> atualizar(@PathVariable long id, @RequestBody Aluno aluno){
        return alunoService.updateAluno(id, aluno);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Aluno> remover(@PathVariable long id) {
        return alunoService.removeAluno(id);
    }

}
