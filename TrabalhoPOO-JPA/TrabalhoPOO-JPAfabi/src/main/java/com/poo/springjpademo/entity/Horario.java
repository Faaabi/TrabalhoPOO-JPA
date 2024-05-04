package com.poo.springjpademo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String horaInicio;
    private String horaFim;
    private String diaSemana;
    
    @ManyToOne
    private Disciplina nomeDisciplina;

    public Horario(String horaInicio, String horaFim, String diaSemana, Disciplina nomeDisciplina){
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.diaSemana = diaSemana;
        this.nomeDisciplina = nomeDisciplina;
    }
}
