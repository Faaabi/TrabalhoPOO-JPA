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
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeDisciplina;

    @ManyToOne
    private Turma nomeTurma;
    @ManyToOne
    private Sala nomeSala;
    @ManyToOne
    private Professor nomeProfessor;

    public Disciplina(String nomeDisciplina,
                      Turma nomeTurma,
                      Sala nomeSala,
                      Professor nomeProfessor){
        this.nomeDisciplina = nomeDisciplina;
        this.nomeTurma = nomeTurma;
        this.nomeSala = nomeSala;
        this.nomeProfessor = nomeProfessor;
    }
}
