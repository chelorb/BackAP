package com.example.BackAP.Controller;


import com.example.BackAP.Entidades.DatosUsuario;

import com.example.BackAP.Interfaces.IntDatosUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DatosUsuarioController {


    @Autowired
    IntDatosUsuario intDatosUsuario;
    @GetMapping("/usuario/traer")

    public List<DatosUsuario> getUsuario(){

        return intDatosUsuario.getUsuario();
    }


    @GetMapping("/usuario/trer/{id}")

    public DatosUsuario findUsuario(@PathVariable Integer id) {
        DatosUsuario datosUsuario=intDatosUsuario.findUsuario(id);
        return datosUsuario;
    }

    @PostMapping("/usuario/crear")

    public void crearUsuario(@RequestBody DatosUsuario usuario){

        intDatosUsuario.saveDatosUsuario(usuario);
    }

    @DeleteMapping("/usuario/borrar/{id}")
    public void borrarUsuario(@PathVariable Integer id){

        intDatosUsuario.deleteUsuario(id);
    }

    @PutMapping("/usuario/editar/{id}")
    public void actualizarUsuario(@RequestBody DatosUsuario usuario) {
        intDatosUsuario.saveDatosUsuario(usuario);
    }

}


