package com.prueba.restsecurity.service.impl;

import com.prueba.restsecurity.dto.AlumnoDTO;
import com.prueba.restsecurity.model.Alumno;
import com.prueba.restsecurity.repository.AlumnoRepository;
import com.prueba.restsecurity.service.AlumnoService;
import com.prueba.restsecurity.service.ClaseService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository ) {
        this.alumnoRepository = alumnoRepository;
    }




    @Override
    public Alumno getById(String idAlumno) {
        return alumnoRepository.findById(idAlumno).orElseThrow(
                () -> new EntityNotFoundException("Entidad Alumno no existente")
        );

    }

    @Override
    public void update(String idAlumno, AlumnoDTO alumnoDTO) {
        //TODO update Alumno
    }

    @Override
    public void delete(String idAlumno) {
        alumnoRepository.delete(getById(idAlumno));
    }

    @Override
    public Alumno create(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }
}
