package com.example.BackAP.Servicios;

import com.example.BackAP.Entidades.Educacion;
import com.example.BackAP.Interfaces.IntEducacion;
import com.example.BackAP.Repositorio.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionServ implements IntEducacion {


@Autowired

    private EducacionRepo educacionRepo;


@Override

    public List<Educacion> getEducacion(){

    List<Educacion> listaEducacion=educacionRepo.findAll();
    return listaEducacion;

    }

    @Override
    public void saveEducacion(Educacion educacion) {
educacionRepo.save(educacion);

    }

    @Override
    public void deleteEducacion(Educacion educacion) {

    }

    @Override
    public void deleteEducacion(Integer id) {
        educacionRepo.deleteById(id);
    }


    @Override

    public Educacion findEducacion(Integer id) {

    Educacion educacion=educacionRepo.findById(id).orElse(null);

    return educacion;


    }



}
