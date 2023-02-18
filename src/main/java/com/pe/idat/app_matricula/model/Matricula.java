package com.pe.idat.app_matricula.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matriculaId;
    private Date fecha;
    private Integer alumnoId;
    private double costo;
//    private Integer CursoId;

    //    @OneToMany(mappedBy = "matricula")
//    private Alumno alumno;
//    @ManyToOne
//    @JoinColumn(name = "curso_id", nullable = false, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(curso_id) references curso(curso_id) "))
//    private List<Curso> cursos;


    public Matricula() {
    }

    public Matricula(Integer matriculaId, Date fecha, Integer alumnoId, double costo, Integer cursoId, Alumno alumno, Curso curso) {
        this.matriculaId = matriculaId;
        this.fecha = fecha;
        this.alumnoId = alumnoId;
        this.costo = costo;
//        this.alumno = alumno;
//        this.curso = curso;
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

//    public Integer getCursoId() {
//        return CursoId;
//    }
//
//    public void setCursoId(Integer cursoId) {
//        CursoId = cursoId;
//    }

//    public List<Curso> getCursos() {
//        return cursos;
//    }
//
//    public void setCursos(List<Curso> cursos) {
//        this.cursos = cursos;
//    }

    //    public Alumno getAlumno() {
//        return alumno;
//    }
//
//    public void setAlumno(Alumno alumno) {
//        this.alumno = alumno;
//    }
}
