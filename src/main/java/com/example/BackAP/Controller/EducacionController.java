package com.example.BackAP.Controller;

import com.example.BackAP.Entidades.Educacion;
import com.example.BackAP.Interfaces.IntEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducacionController {

    @Autowired
    private IntEducacion intEducacion;
    @GetMapping("/educacion/traer")

    public List<Educacion> getEducacion(){

        return intEducacion.getEducacion();
    }


    @GetMapping("/educacion/traer/{id}")

    public Educacion findEducacion (@PathVariable Integer id) {
        Educacion educacion=intEducacion.findEducacion(id);
        return educacion;
    }

    @PostMapping("/educacion/crear")

    public void crearEducacion(@RequestBody Educacion educacion){

       intEducacion.saveEducacion(educacion);
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Integer id){

        intEducacion.deleteEducacion(id);
    }

    @PutMapping("/educacion/editar/{id}")
    public void actualizarEducacion(@RequestBody Educacion educacion) {

        intEducacion.saveEducacion(educacion);
    }

}
