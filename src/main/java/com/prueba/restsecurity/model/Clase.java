package com.prueba.restsecurity.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Clase extends Persistable {

    @Column(length = 100, nullable = false)
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clase")
    private List<Alumno> alumnos = new ArrayList<>();

}
