package com.prueba.restsecurity.controller;

import com.prueba.restsecurity.dto.AlumnoDTO;
import com.prueba.restsecurity.dto.ClaseDTO;
import com.prueba.restsecurity.mapper.AlumnoMapper;
import com.prueba.restsecurity.mapper.ClaseMapper;
import com.prueba.restsecurity.service.ClaseService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clase")
public class ClaseController {

    private final ClaseService claseService;
    private final ClaseMapper claseMapper;
    private final AlumnoMapper alumnoMapper;

    public ClaseController(ClaseService claseService, ClaseMapper claseMapper, AlumnoMapper alumnoMapper) {
        this.claseService = claseService;
        this.claseMapper = claseMapper;
        this.alumnoMapper = alumnoMapper;
    }

    @GetMapping
    @Cacheable("clases")
    public List<ClaseDTO> getAll() {
        return claseMapper.daoToDtoList(
            claseService.getAll()

        );
    }

    @GetMapping("/{idClase}")
    public ClaseDTO getById(@PathVariable("idClase") String idClase) {
        return claseMapper.daoToDto(
                claseService.getById(idClase)
        );
    }


    @PostMapping
    @CacheEvict(value = "clases", allEntries = true)
    public ClaseDTO create(@RequestBody ClaseDTO claseDTO) {
        return claseMapper.daoToDto(
            claseService.create(
                    claseMapper.dtoToDao(claseDTO)
            )
        );
    }

    @GetMapping("/{idClase}/alumnos")
    public List<AlumnoDTO> getAllByClase(@PathVariable("idClase") String idClase) {
        return alumnoMapper.daoToDtoList(
                claseService.getById(idClase).getAlumnos()
        );
    }

    @PostMapping("/{idClase}/alumno")
    public AlumnoDTO createAlumnoInClase(@RequestBody AlumnoDTO alumnoDTO, @PathVariable("idClase") String idClase) {
        return alumnoMapper.daoToDto(
            claseService.createAlumnoInClase(idClase,alumnoMapper.dtoToDao(alumnoDTO))
        );
    }


}
