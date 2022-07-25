package com.example.BackAP.Interfaces;

import com.example.BackAP.Entidades.DatosUsuario;

import java.util.List;

public interface IntDatosUsuario {
    List<DatosUsuario> getUsuario();

    void saveDatosUsuario(DatosUsuario usuario);

    void deleteUsuario(Integer id);

    DatosUsuario findUsuario(Integer id);
}
