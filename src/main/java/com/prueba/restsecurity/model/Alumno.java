package com.prueba.restsecurity.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Alumno extends Persistable {

    @Column(length = 100, nullable = false)
    private String nombre;

    @ElementCollection
    @CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "alumno"))
    @Column(name = "telefono")
    private List<String> telefonos;

    @ManyToOne
    @JoinColumn(name = "id_clase", referencedColumnName = "id")
    private Clase clase;

}
