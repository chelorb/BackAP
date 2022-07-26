package com.example.BackAP.Entidades;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)

    private Integer idProyecto;
    private String nombreProyecto;
    private Integer anioProyecto;
    private Integer mesProyecto;
    private String descripcionProyecto;
    private String linkProyecto;


    public Proyecto() {
    }

    public Proyecto(Integer idProyecto, String nombreProyecto, Integer anioProyecto, Integer mesProyecto, String descripcionProyecto, String linkProyecto) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.anioProyecto = anioProyecto;
        this.mesProyecto = mesProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.linkProyecto = linkProyecto;
    }

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public Integer getAnioProyecto() {
        return anioProyecto;
    }

    public void setAnioProyecto(Integer anioProyecto) {
        this.anioProyecto = anioProyecto;
    }

    public Integer getMesProyecto() {
        return mesProyecto;
    }

    public void setMesProyecto(Integer mesProyecto) {
        this.mesProyecto = mesProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getLinkProyecto() {
        return linkProyecto;
    }

    public void setLinkProyecto(String linkProyecto) {
        this.linkProyecto = linkProyecto;
    }
}
