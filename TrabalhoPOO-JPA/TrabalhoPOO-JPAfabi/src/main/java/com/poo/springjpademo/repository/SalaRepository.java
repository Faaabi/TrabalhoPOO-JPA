package com.poo.springjpademo.repository;

import com.poo.springjpademo.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SalaRepository extends JpaRepository<Sala, Long> {
    Optional<Sala> findByNomeSala(String nomeSala);
}
