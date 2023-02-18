package com.pe.idat.app_matricula.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="alumno")
public class Alumno implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer matriculaId;
    private Date fecha;
    private Integer alumnoId;
    private double costo;
    private Integer CursoId;
//    @OneToMany(mappedBy="matricula")
//    private Alumno alumno ;
//    @OneToMany(mappedBy="matricula")
//    private List<Curso> cursos;
//    private List<Matricula> matriculas;

    public Alumno() {
    }

    public Alumno(Integer matriculaId, Date fecha, Integer alumnoId, double costo, Integer cursoId) {
        this.matriculaId = matriculaId;
        this.fecha = fecha;
        this.alumnoId = alumnoId;
        this.costo = costo;
        CursoId = cursoId;
    }

    public Integer getMatriculaId() {
        return matriculaId;
    }

    public void setMatriculaId(Integer matriculaId) {
        this.matriculaId = matriculaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Integer getCursoId() {
        return CursoId;
    }

    public void setCursoId(Integer cursoId) {
        CursoId = cursoId;
    }
}
