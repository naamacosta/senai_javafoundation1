package com.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
@Table
public class Aluno {
    public Aluno() {
    }

    public Aluno(long id, String nome, Date dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public Aluno(String nome, Date dataNascimento, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }


    @Id //chavePrimaria
    @SequenceGenerator(
            name = "gerador_aluno",
            sequenceName = "gerador_aluno",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gerador_aluno"
    )

    private long id;
    private String nome;
    private Date dataNascimento;
    private String email;
}