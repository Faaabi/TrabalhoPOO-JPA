package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Disciplina;
import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    List<Disciplina> findAllByProfessor(Professor professor);
}
