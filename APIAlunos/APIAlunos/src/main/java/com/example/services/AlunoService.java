package com.example.services;

import com.example.models.Aluno;
import com.example.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class AlunoService {

    private AlunoRepository alunoRepository;

    @Autowired
   public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;

    }

    public ResponseEntity<List<Aluno>> getAlunos() {
        List<Aluno> alunos = alunoRepository.findAll();

        return new ResponseEntity<>(alunos, HttpStatus.OK);
    }

    public ResponseEntity<Aluno> createAluno(Aluno aluno) {
        alunoRepository.save(aluno);

        return new ResponseEntity<>(aluno, HttpStatus.CREATED);
    }

    public ResponseEntity<Aluno> updateAluno(long id, Aluno aluno) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);
        if (optionalAluno.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        Aluno alunoAtualizar = optionalAluno.get();
        alunoAtualizar.setNome(aluno.getNome());
        alunoAtualizar.setEmail(aluno.getEmail()):
        alunoAtualizar.setDataNascimento(aluno.getDataNascimento());

        alunoRepository.save(alunoAtualizar);

        return ResponseEntity.ok(alunoAtualizar);
    }

    public ResponseEntity<Aluno> removeAluno(long id) {
        Optional<Aluno> optionalAluno = alunoRepository.findById(id);

        if(optionalAluno.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        alunoRepository.deleteById(id);

        return ResponseEntity.ok(optionalAluno.get());
    }
}
