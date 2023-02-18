package com.riccardosennati.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riccardosennati.app.entities.Dispositivo;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Integer>{

}
