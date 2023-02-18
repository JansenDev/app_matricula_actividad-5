package com.pe.idat.app_matricula.services.impl;

import com.pe.idat.app_matricula.model.Curso;
import com.pe.idat.app_matricula.repository.CursoRepository;
import com.pe.idat.app_matricula.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository repositorio;

    @Override
    @Transactional
    public void insert(Curso curso) {
        repositorio.save(curso);
    }
    @Override
    @Transactional
    public void update(Curso curso) {
        repositorio.save(curso);
    }
    @Override
    @Transactional
    public void delete(Integer cursoId) {
        repositorio.deleteById(cursoId);

    }
    @Override
    @Transactional()
    public Curso findById(Integer cursoId) {
        return repositorio.findById(cursoId).orElse(null);
    }
    @Override
    @Transactional()
    public Collection<Curso> findAll() {
        return (Collection<Curso>)repositorio.findAll();
    }

}
