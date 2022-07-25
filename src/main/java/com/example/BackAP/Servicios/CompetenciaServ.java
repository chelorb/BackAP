package com.example.BackAP.Servicios;


import com.example.BackAP.Entidades.Competencia;
import com.example.BackAP.Interfaces.IntCompetencia;
import com.example.BackAP.Repositorio.CompetenciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaServ implements IntCompetencia {


    @Autowired
    private CompetenciaRepo competenciaRepo;

    @Override
    public List<Competencia> getCompetencia() {

        List<Competencia> listaCompetencia = competenciaRepo.findAll();

        return listaCompetencia;

    }

    @Override
    public void saveCompetencia(Competencia competencia) {

        competenciaRepo.save(competencia);

    }

    @Override
    public void deleteCompetencia(Integer id){

        competenciaRepo.deleteById(id);
    }


@Override

    public Competencia findCompetencia(Integer id) {

    Competencia competencia = competenciaRepo.findById(id).orElse(null);
    return competencia;

}



}
