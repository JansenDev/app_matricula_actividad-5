package com.pe.idat.app_matricula.repository;

import com.pe.idat.app_matricula.model.Docente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends CrudRepository<Docente,Long> {
}
