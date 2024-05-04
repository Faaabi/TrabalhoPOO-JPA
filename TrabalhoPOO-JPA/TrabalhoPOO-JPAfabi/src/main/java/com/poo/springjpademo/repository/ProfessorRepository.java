package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Optional<Professor> findByNomeProfessor(String nome);
    Optional<Professor> findById(Long Id);
}
