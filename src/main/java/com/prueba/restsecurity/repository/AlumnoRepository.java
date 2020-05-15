package com.prueba.restsecurity.repository;

import com.prueba.restsecurity.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String> {

    Optional<Alumno> findById(String id);
}
