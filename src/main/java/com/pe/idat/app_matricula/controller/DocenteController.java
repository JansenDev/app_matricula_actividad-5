package com.pe.idat.app_matricula.controller;

import com.pe.idat.app_matricula.model.Docente;
import com.pe.idat.app_matricula.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docente")
public class DocenteController {

    @Autowired
    private DocenteService docenteService
            ;

    @GetMapping("/listar")
    public List<Docente> findAll(){
        return docenteService.findAll();
    }


    @PostMapping("/guardar")
    public Docente save(@RequestBody Docente docente){
        return docenteService.save(docente);
    }

    @PutMapping("/actualizar/{id}")
    public Docente update(@PathVariable("id") Long id,@RequestBody Docente docente ){
        docente.setDocente_id(id);
        return docenteService.update(docente);
    }

    @DeleteMapping("/eliminar/{id}")
    public boolean delente(@PathVariable("id") Long id){
         docenteService.deleteById(id);
         return true;
    }


}
