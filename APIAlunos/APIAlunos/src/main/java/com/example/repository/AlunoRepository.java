package com.example.repository;

import com.example.models.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}