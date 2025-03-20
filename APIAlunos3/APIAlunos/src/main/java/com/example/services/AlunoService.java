package com.example.services;

import com.example.models.AlunoModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private static final String FILE_PATH = "src/main/resources/alunos.json";
    private List<AlunoModel> alunoModels;
    private ObjectMapper objectMapper;

    public AlunoService() throws IOException{
        this.objectMapper = new ObjectMapper();
        this.alunoModels = carregarAlunos();
    }

    public ResponseEntity<List<AlunoModel>> getAlunos() {
        return new ResponseEntity<>(alunoModels, HttpStatus.OK);
    }

    public ResponseEntity<AlunoModel> createAluno(AlunoModel aluno) throws IOException{
        aluno.setId((long) (alunoModels.size() +1));
        alunoModels.add(aluno);
        salvarAlunos();
        return new ResponseEntity<>(aluno, HttpStatus.CREATED);
    }

    public ResponseEntity<AlunoModel> updateAluno(long id, AlunoModel aluno) throws IOException{
        Optional<AlunoModel> optionalAlunoModel = alunoModels.stream().filter(a -> a.getId() == id).findFirst();

        if(optionalAlunoModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        AlunoModel alunoAtualizar = optionalAlunoModel.get();
        alunoAtualizar.setNome(aluno.getNome());
        alunoAtualizar.setEmail(aluno.getEmail());
        alunoAtualizar.setDataNascimento(aluno.getDataNascimento());

        salvarAlunos();
        return ResponseEntity.ok(alunoAtualizar);

    }

    public ResponseEntity<AlunoModel> removeAluno (long id) throws IOException{
        Optional<AlunoModel> optionalAlunoModel = alunoModels.stream().filter(a -> a.getId() == id).findFirst();

        if(optionalAlunoModel.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        alunoModels.remove((optionalAlunoModel.get()));
        salvarAlunos();
        return ResponseEntity.ok(optionalAlunoModel.get());
    }

    private List<AlunoModel> carregarAlunos() throws IOException{
        File file = new File(FILE_PATH);
        if(file.exists()){
            return objectMapper.readValue(file, objectMapper.getTypeFactory().constructCollectionType(List.class, AlunoModel.class));

        }else{
            return new ArrayList<>();
        }
    }

    private void salvarAlunos() throws IOException{
        objectMapper.writeValue(new File(FILE_PATH), alunoModels);
    }

}
