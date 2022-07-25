package com.example.BackAP.Controller;

import com.example.BackAP.Entidades.Competencia;
import com.example.BackAP.Entidades.Proyecto;
import com.example.BackAP.Interfaces.IntCompetencia;
import com.example.BackAP.Interfaces.IntProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProyectoController {


    @Autowired
    IntProyecto intProyecto;
    @GetMapping("/proyecto/traer")

    public List<Proyecto> getProyecto(){

        return intProyecto.getProyecto();
    }


    @GetMapping("/proyecto/trer/{id}")

    public Proyecto findProyecto(@PathVariable Integer id) {
        Proyecto proyecto=intProyecto.findProyecto(id);
        return proyecto;
    }

    @PostMapping("/proyecto/crear")

    public void crearProyecto(@RequestBody Proyecto proyecto){

        intProyecto.saveProyecto(proyecto);
    }

    @DeleteMapping("/proyecto/borrar/{id}")
    public void borrarProyecto(@PathVariable Integer id){

        intProyecto.deleteProyecto(id);
    }

    @PutMapping("/proyecto/editar/{id}")
    public void actualizarProyecto(@RequestBody Proyecto proyecto) {
        intProyecto.saveProyecto(proyecto);
    }

}
