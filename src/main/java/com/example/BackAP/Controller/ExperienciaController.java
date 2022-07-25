package com.example.BackAP.Controller;

import com.example.BackAP.Entidades.Competencia;
import com.example.BackAP.Entidades.Experiencia;
import com.example.BackAP.Interfaces.IntCompetencia;
import com.example.BackAP.Interfaces.IntExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExperienciaController {

    @Autowired
    IntExperiencia intExperiencia;
    @GetMapping("/experiencia/traer")

    public List<Experiencia> getExperiencia(){

        return intExperiencia.getExperiencia();
    }


    @GetMapping("/experiencia/traer/{id}")

    public Experiencia findExperiencia(@PathVariable Integer id) {
        Experiencia experiencia=intExperiencia.findExperiencia(id);
        return experiencia;
    }

    @PostMapping("/experiencia/crear")

    public void crearExperiencia(@RequestBody Experiencia experiencia){

        intExperiencia.saveExperiencia(experiencia);
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Integer id){

        intExperiencia.deleteExperiencia(id);
    }

    @PutMapping("/experiencia/editar/{id}")
    public void actualizarExperiencia(@RequestBody Experiencia experiencia) {
        intExperiencia.saveExperiencia(experiencia);
    }

}
