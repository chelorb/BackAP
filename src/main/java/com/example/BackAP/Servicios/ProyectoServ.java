package com.example.BackAP.Servicios;

import com.example.BackAP.Entidades.Proyecto;
import com.example.BackAP.Interfaces.IntProyecto;
import com.example.BackAP.Repositorio.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoServ implements IntProyecto {


    @Autowired
    private ProyectoRepo proyectoRepo;


    @Override
    public List<Proyecto> getProyecto() {

        List<Proyecto> listaProyecto = proyectoRepo.findAll();
        return listaProyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {

        proyectoRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Proyecto proyecto) {

    }

    @Override
    public void deleteProyecto(Integer id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Integer id) {
        Proyecto proyecto = proyectoRepo.findById(id).orElse(null);
        return proyecto;


    }
}