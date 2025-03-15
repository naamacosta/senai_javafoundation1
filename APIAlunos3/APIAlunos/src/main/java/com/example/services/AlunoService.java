package com.example.services;

import com.example.models.AlunoModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class AlunoService {

    private static final String FILE_PATH = "src/main/resources/alunos.json";
    private List<AlunoModel> alunoModels;
    private ObjectMapper objectMapper;

    public AlunoService() throws IOException{
        this.objectMapper = new ObjectMapper();
        this.alunoModels = getAlunos();
    }

    public ResponseEntity<List<AlunoModel>> getAlunos() {
        return new ResponseEntity<>(alunoModels, HttpStatus.OK);
    }

    public ResponseEntity<AlunoModel> createAluno(AlunoModel aluno) throws IOException{
        aluno.setId((long) (alunoModel.size +1));
        alunoModels.add(aluno);
        salvarAlunos();
        return new ResponseEntity<>(aluno, HttpStatus.CREATED);
    }

    public ResponseEntity<AlunoModel> updateAluno(long id, AlunoModel aluno) throws IOException{

    }

}
