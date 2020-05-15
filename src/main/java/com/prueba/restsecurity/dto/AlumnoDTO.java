package com.prueba.restsecurity.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AlumnoDTO implements Serializable {

    private String id;
    private String nombre;
    private List<String> telefonos;

}
