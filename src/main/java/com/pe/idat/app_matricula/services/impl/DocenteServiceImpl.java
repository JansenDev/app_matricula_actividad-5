package com.pe.idat.app_matricula.services.impl;

import com.pe.idat.app_matricula.model.Docente;
import com.pe.idat.app_matricula.repository.DocenteRepository;
import com.pe.idat.app_matricula.services.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DocenteServiceImpl implements DocenteService {


    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public List<Docente> findAll() {
        return (List<Docente>) docenteRepository.findAll();
    }

    @Override
    public Docente save(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente update(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public void deleteById(Long id) {
        docenteRepository.deleteById(id);
    }
}
