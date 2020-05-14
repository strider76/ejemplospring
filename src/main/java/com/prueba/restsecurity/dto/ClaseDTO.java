package com.prueba.restsecurity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClaseDTO {

    private String id;
    private String nombre;
    private List<AlumnoDTO> alumnos = new ArrayList<>();

}
