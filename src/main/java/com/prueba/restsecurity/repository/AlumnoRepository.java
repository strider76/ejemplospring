package com.prueba.restsecurity.repository;

import com.prueba.restsecurity.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {

    Optional<Alumno> findById(String id);
}
