package com.pe.idat.app_matricula.services;


import com.pe.idat.app_matricula.model.Curso;

import java.util.Collection;

public interface CursoService {
    public abstract void insert(Curso curso);
    public abstract void update(Curso curso);
    public abstract void delete(Integer cursoId);
    public abstract Curso findById(Integer cursoId);
    public abstract Collection<Curso> findAll();
}

