package com.prueba.restsecurity.service;

import com.prueba.restsecurity.dto.ClaseDTO;
import com.prueba.restsecurity.model.Alumno;
import com.prueba.restsecurity.model.Clase;

import java.util.List;

public interface ClaseService {

    List<Clase> getAll();
    Clase getById(String idClase);
    Clase create(Clase clase);
    void update(String idClase, ClaseDTO claseDTO);
    void delete(String idClase);

    Alumno createAlumnoInClase(String idClase, Alumno dtoToDao);
}
