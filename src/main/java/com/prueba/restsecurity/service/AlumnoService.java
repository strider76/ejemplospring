package com.prueba.restsecurity.service;

import com.prueba.restsecurity.dto.AlumnoDTO;
import com.prueba.restsecurity.dto.ClaseDTO;
import com.prueba.restsecurity.model.Alumno;
import com.prueba.restsecurity.model.Clase;

import java.util.List;

public interface AlumnoService {

    Alumno getById(String idAlumno);
    void update(String idAlumno, AlumnoDTO alumnoDTO);
    void delete(String idAlumno);

    Alumno create(Alumno alumno);
}
