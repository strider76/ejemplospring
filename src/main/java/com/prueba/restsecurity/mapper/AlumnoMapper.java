package com.prueba.restsecurity.mapper;

import com.prueba.restsecurity.dto.AlumnoDTO;
import com.prueba.restsecurity.model.Alumno;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AlumnoMapper {

    AlumnoDTO daoToDto(Alumno alumno);

    List<AlumnoDTO> daoToDtoList(List<Alumno> alumnos);

    @InheritInverseConfiguration
    Alumno dtoToDao(AlumnoDTO alumnoDTO);

    List<Alumno> dtoToDaoList(List<AlumnoDTO> alumnoDTOS);

}
