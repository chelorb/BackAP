package com.example.BackAP.Controller;


import com.example.BackAP.Entidades.Competencia;
import com.example.BackAP.Interfaces.IntCompetencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompetenciaController {

    @Autowired
    IntCompetencia intCompetencia;
    @GetMapping("/competencia/traer")

    public List<Competencia> getCompetencia(){

        return intCompetencia.getCompetencia();
    }


    @GetMapping("/competencia/trer/{id}")

    public Competencia findCompetencia(@PathVariable Integer id) {
     Competencia competencia=intCompetencia.findCompetencia(id);
     return competencia;
    }

    @PostMapping("/competencia/crear")

    public void crearCompetencia(@RequestBody Competencia competencia){

        intCompetencia.saveCompetencia(competencia);
    }

@DeleteMapping("/competencia/borrar/{id}")
    public void borrarCompetencia(@PathVariable Integer id){

        intCompetencia.deleteCompetencia(id);
}

    @PutMapping("/competencia/editar/{id}")
    public void actualizarCompetencia(@RequestBody Competencia competencia) {
        intCompetencia.saveCompetencia(competencia);
    }


}
