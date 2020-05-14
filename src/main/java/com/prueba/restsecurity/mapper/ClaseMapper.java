package com.prueba.restsecurity.mapper;

import com.prueba.restsecurity.dto.ClaseDTO;
import com.prueba.restsecurity.model.Clase;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = AlumnoMapper.class)
public interface ClaseMapper {

    ClaseDTO daoToDto(Clase clase);

    List<ClaseDTO> daoToDtoList(List<Clase> clases);

    @InheritInverseConfiguration
    Clase dtoToDao(ClaseDTO claseDTO);

    List<Clase> dtoToDaoList(List<ClaseDTO> claseDTOS);

}
