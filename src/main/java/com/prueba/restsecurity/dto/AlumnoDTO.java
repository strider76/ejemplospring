package com.prueba.restsecurity.dto;

import lombok.Data;

import java.util.List;

@Data
public class AlumnoDTO {

    private String id;
    private String nombre;
    private List<String> telefonos;

}
