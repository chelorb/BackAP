package com.example.BackAP.Entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)

    private Integer idEdu;
    private Integer inicioEdu;
    private Integer finEdu;
    private String nombreInstitucion;
    private String tituloEdu;


    public Educacion() {
    }

    public Educacion(Integer idEdu, Integer inicioEdu, Integer finEdu, String nombreInstitucion, String tituloEdu) {
        this.idEdu = idEdu;
        this.inicioEdu = inicioEdu;
        this.finEdu = finEdu;
        this.nombreInstitucion = nombreInstitucion;
        this.tituloEdu = tituloEdu;
    }

    public Integer getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Integer idEdu) {
        this.idEdu = idEdu;
    }

    public Integer getInicioEdu() {
        return inicioEdu;
    }

    public void setInicioEdu(Integer inicioEdu) {
        this.inicioEdu = inicioEdu;
    }

    public Integer getFinEdu() {
        return finEdu;
    }

    public void setFinEdu(Integer finEdu) {
        this.finEdu = finEdu;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }
}