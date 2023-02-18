package com.riccardosennati.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entities.Ruolo;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Integer>{

}
