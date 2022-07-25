package com.example.BackAP.Servicios;

import com.example.BackAP.Entidades.Experiencia;
import com.example.BackAP.Interfaces.IntExperiencia;
import com.example.BackAP.Repositorio.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaServ implements IntExperiencia {

    @Autowired
    ExperienciaRepo experienciaRepo;

    @Override

    public List<Experiencia> getExperiencia() {

        List<Experiencia> listaExperiencia = experienciaRepo.findAll();
        return listaExperiencia;
    }

        @Override
                public void saveExperiencia(Experiencia experiencia){

            experienciaRepo.save(experiencia);
        }

        @Override
    public void deleteExperiencia(Experiencia experiencia){
        experienciaRepo.delete(experiencia);
        }

        @Override
    public Experiencia findExperiencia(Integer id){

        Experiencia experiencia=experienciaRepo.findById(id).orElse(null);
        return experiencia;
        }

    @Override
    public void deleteExperiencia(Integer id) {

    }


}





