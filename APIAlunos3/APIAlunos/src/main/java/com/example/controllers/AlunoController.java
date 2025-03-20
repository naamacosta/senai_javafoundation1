package com.example.controllers;


import com.example.models.AlunoModel;
import com.example.services.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/Alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        System.out.println("AlunoController carregado!");
        this.alunoService = alunoService;
    }

    @GetMapping
    public ResponseEntity<List<AlunoModel>> listarAlunos() {
        return alunoService.getAlunos();
    }

    @GetMapping("/testes")
    public ResponseEntity<String> getTeste() {
        return ResponseEntity.ok("Rota funcionando!");
    }

    @PostMapping
    public ResponseEntity<AlunoModel> criarAluno(@RequestBody AlunoModel alunoModel) throws IOException {
        return alunoService.createAluno(alunoModel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoModel> atualizarAluno(@PathVariable long id, @RequestBody AlunoModel alunoModel) throws IOException{
        return alunoService.updateAluno(id, alunoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AlunoModel> excluirAluno(@PathVariable long id) throws IOException{
        return alunoService.removeAluno(id);
    }
}
