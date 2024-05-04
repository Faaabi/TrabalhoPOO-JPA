package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface TurmaRepository extends JpaRepository<Turma, Long> {

    Optional<Turma> findByNomeTurma(String nomeTurma);

}
