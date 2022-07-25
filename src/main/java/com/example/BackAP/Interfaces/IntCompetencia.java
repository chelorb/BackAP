package com.example.BackAP.Interfaces;

import com.example.BackAP.Entidades.Competencia;

import java.util.List;

public interface IntCompetencia {

    public List<Competencia> getCompetencia();


    void saveCompetencia(Competencia competencia);

    void deleteCompetencia(Integer id);

    Competencia findCompetencia(Integer id);
}
