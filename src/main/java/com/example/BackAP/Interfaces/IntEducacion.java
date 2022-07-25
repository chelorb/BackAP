package com.example.BackAP.Interfaces;

import com.example.BackAP.Entidades.Educacion;

import java.util.List;

public interface IntEducacion {
    List<Educacion> getEducacion();

    void saveEducacion(Educacion educacion);

    void deleteEducacion(Educacion educacion);

    void deleteEducacion(Integer id);

    Educacion findEducacion(Integer id);
}
