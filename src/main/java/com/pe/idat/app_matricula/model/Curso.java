package com.pe.idat.app_matricula.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer curso_Id;
    @Column
    private String nombre;
    @Column
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false,
            foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(docente_id) references docente(docente_id) "))
    private Docente docente;

//    @OneToMany(mappedBy = "curso")
//    private Matricula matricula;


    public Curso(Integer curso_Id, String nombre, String descripcion) {
        this.curso_Id = curso_Id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Curso() {

    }

    public Integer getCurso_Id() {
        return curso_Id;
    }

    public void setCurso_Id(Integer curso_Id) {
        this.curso_Id = curso_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
