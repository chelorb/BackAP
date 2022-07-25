package com.example.BackAP.Interfaces;

import com.example.BackAP.Entidades.Experiencia;

import java.util.List;

public interface IntExperiencia {
    List<Experiencia> getExperiencia();

    void saveExperiencia(Experiencia experiencia);

    void deleteExperiencia(Experiencia experiencia);

    Experiencia findExperiencia(Integer id);

    void deleteExperiencia(Integer id);
}
