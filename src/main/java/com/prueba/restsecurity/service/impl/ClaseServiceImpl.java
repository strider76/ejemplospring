package com.prueba.restsecurity.service.impl;

import com.prueba.restsecurity.dto.ClaseDTO;
import com.prueba.restsecurity.model.Alumno;
import com.prueba.restsecurity.model.Clase;
import com.prueba.restsecurity.repository.ClaseRepository;
import com.prueba.restsecurity.service.AlumnoService;
import com.prueba.restsecurity.service.ClaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseServiceImpl implements ClaseService {

    private final ClaseRepository claseRepository;
    private final AlumnoService alumnoService;

    public ClaseServiceImpl(ClaseRepository claseRepository, AlumnoService alumnoService) {
        this.claseRepository = claseRepository;
        this.alumnoService = alumnoService;
    }


    @Override
    public List<Clase> getAll() {
        return claseRepository.findAll();
    }

    @Override
    public Clase getById(String idClase) {
        return claseRepository.getOne(idClase);
    }

    @Override
    public Clase create(Clase clase) {
        return claseRepository.save(clase);
    }

    @Override
    public void update(String idClase, ClaseDTO claseDTO) {
        //TODO update clase
    }

    @Override
    public void delete(String idClase) {
        claseRepository.delete(getById(idClase));
    }

    @Override
    public Alumno createAlumnoInClase(String idClase, Alumno alumno) {
        Clase clase = getById(idClase);
        alumno.setClase(clase);
        return alumnoService.create(alumno);
    }
}
