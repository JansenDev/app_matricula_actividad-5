package com.pe.idat.app_matricula.controller;


import com.pe.idat.app_matricula.model.Curso;
import com.pe.idat.app_matricula.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping("/listar") //Http Method GET
    public ResponseEntity<?> listar() {
        Collection<Curso> itemsCurso = cursoService.findAll();
        return new ResponseEntity<>(itemsCurso, HttpStatus.OK);
    }

    @GetMapping("/buscar/{cursoId}") //Http Method GET
    public ResponseEntity<?> buscar(@PathVariable Integer cursoId) {
        Curso cursoDB = cursoService.findById(cursoId);
        if (cursoDB != null) {
            return new ResponseEntity<>(cursoDB, HttpStatus.OK); //Http status code
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
    }

    @PostMapping("/agregar") //Http Method POST
    public ResponseEntity<?> agregar(@RequestBody Curso curso) {
        cursoService.insert(curso);
        return new ResponseEntity<Void>(HttpStatus.CREATED); //Http status code
    }

    @PutMapping("/editar/{cursoId}") //Http Method PUT
    public ResponseEntity<?> editar(@PathVariable Integer cursoId,
                                    @RequestBody Curso curso) {
        Curso cursoDB = cursoService.findById(cursoId);
        if (cursoDB != null) {
            cursoDB.setNombre(curso.getNombre());
            cursoDB.setDescripcion(curso.getDescripcion());
            cursoService.update(cursoDB);
            return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
    }

    @DeleteMapping("/borrar/{cursoId}") //Http Method DELETE
    public ResponseEntity<?> borrar(@PathVariable Integer cursoId) {
        Curso cursoDB = cursoService.findById(cursoId);

        if (cursoDB != null) {
            cursoService.delete(cursoId);
            return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
    }

}