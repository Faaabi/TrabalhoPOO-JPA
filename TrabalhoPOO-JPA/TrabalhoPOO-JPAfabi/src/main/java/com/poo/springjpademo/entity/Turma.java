package com.poo.springjpademo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeTurma;

    @ManyToOne
    private Curso nomeCurso;
    
    public Turma(String nomeTurma, Curso nomeCurso){
        this.nomeTurma = nomeTurma;
        this.nomeCurso = nomeCurso;

    }
}