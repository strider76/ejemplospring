package com.prueba.restsecurity.repository;

import com.prueba.restsecurity.model.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, String> {
}
