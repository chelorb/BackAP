package com.example.BackAP.Entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)

    private Integer idExp;
    private Integer inicioExp;
    private Integer finExp;
    private String empresaExp;
    private String cargoExp;
    private String tareasExp;
    private String fotoExp;


    public Experiencia() {
    }

    public Experiencia(Integer idExp, Integer inicioExp, Integer finExp, String empresaExp, String cargoExp, String tareasExp, String fotoExp) {
        this.idExp = idExp;
        this.inicioExp = inicioExp;
        this.finExp = finExp;
        this.empresaExp = empresaExp;
        this.cargoExp = cargoExp;
        this.tareasExp = tareasExp;
        this.fotoExp = fotoExp;
    }

    public Integer getIdExp() {
        return idExp;
    }

    public void setIdExp(Integer idExp) {
        this.idExp = idExp;
    }

    public Integer getInicioExp() {
        return inicioExp;
    }

    public void setInicioExp(Integer inicioExp) {
        this.inicioExp = inicioExp;
    }

    public Integer getFinExp() {
        return finExp;
    }

    public void setFinExp(Integer finExp) {
        this.finExp = finExp;
    }

    public String getEmpresaExp() {
        return empresaExp;
    }

    public void setEmpresaExp(String empresaExp) {
        this.empresaExp = empresaExp;
    }

    public String getCargoExp() {
        return cargoExp;
    }

    public void setCargoExp(String cargoExp) {
        this.cargoExp = cargoExp;
    }

    public String getTareasExp() {
        return tareasExp;
    }

    public void setTareasExp(String tareasExp) {
        this.tareasExp = tareasExp;
    }

    public String getFotoExp() {
        return fotoExp;
    }

    public void setFotoExp(String fotoExp) {
        this.fotoExp = fotoExp;
    }
}




