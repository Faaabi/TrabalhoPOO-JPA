package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Optional<Curso> findByNomeCurso(String nomeCurso);
    List<Curso> findAllByNomeCurso(String nomeCurso); // nao entendi o que cada um faz e qual deveria usar
}
