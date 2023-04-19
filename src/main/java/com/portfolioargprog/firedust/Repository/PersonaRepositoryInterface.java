package com.portfolioargprog.firedust.Repository;

import com.portfolioargprog.firedust.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositoryInterface extends JpaRepository<Persona,Long> {
}
