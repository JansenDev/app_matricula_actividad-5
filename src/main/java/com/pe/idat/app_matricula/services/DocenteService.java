package com.pe.idat.app_matricula.services;

import com.pe.idat.app_matricula.model.Docente;

import java.util.List;

public interface DocenteService {

    public abstract List<Docente> findAll();

    public abstract  Docente save(Docente docente);

    public abstract  Docente update (Docente docente);

    public abstract void deleteById(Long id);

}
