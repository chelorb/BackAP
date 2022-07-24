package com.example.BackAP.Entidades;

import javax.persistence.*;
import java.util.List;

@Entity
public class DatosUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)

    private Integer id;
    private String nombre;
    private String apellido;
    private String profesion;
    private String descripcion;
private String fotoPerfil;
private String fotoBanner;


@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCompetencia")

    private List<Competencia> competenciaList;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")

    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")

    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyecto")

    private List<Proyecto> proyectoList;


    public DatosUsuario() {
    }

    public DatosUsuario(Integer id, String nombre, String apellido, String profesion, String descripcion, String fotoPerfil, String fotoBanner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.descripcion = descripcion;
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getFotoBanner() {
        return fotoBanner;
    }

    public void setFotoBanner(String fotoBanner) {
        this.fotoBanner = fotoBanner;
    }
}
