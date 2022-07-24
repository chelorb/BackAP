package com.example.BackAP.Entidades;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Competencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)

    private Integer idCompetencia;
    private String nombre;
    private String apellido;
    private String grado;
    private String foto;


    public Competencia() {
    }

    public Competencia(Integer idCompetencia, String nombre, String apellido, String grado, String foto) {
        this.idCompetencia = idCompetencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.foto = foto;
    }

    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
