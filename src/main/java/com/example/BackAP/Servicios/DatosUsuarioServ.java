package com.example.BackAP.Servicios;

import com.example.BackAP.Entidades.DatosUsuario;
import com.example.BackAP.Interfaces.IntDatosUsuario;
import com.example.BackAP.Repositorio.DatosUsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosUsuarioServ implements IntDatosUsuario {

    @Autowired
    DatosUsuarioRepo datosUsuarioRepo;


    @Override
    public List<DatosUsuario> getUsuario(){

        List<DatosUsuario> listaUsuario=datosUsuarioRepo.findAll();
        return listaUsuario;
    }
    @Override
    public void saveDatosUsuario(DatosUsuario usuario){
        datosUsuarioRepo.save(usuario);

    }

    @Override
    public void deleteUsuario(Integer id){

        datosUsuarioRepo.deleteById(id);
    }

    @Override
    public DatosUsuario findUsuario(Integer id) {
DatosUsuario usuario=datosUsuarioRepo.findById(id).orElse(null);
return usuario;
    }




}
