package com.example.BackAP.Interfaces;

import com.example.BackAP.Entidades.Proyecto;

import java.util.List;

public interface IntProyecto {
    List<Proyecto> getProyecto();

    void saveProyecto(Proyecto proyecto);

    void deleteProyecto(Integer id);

    Proyecto findProyecto(Integer id);
}
