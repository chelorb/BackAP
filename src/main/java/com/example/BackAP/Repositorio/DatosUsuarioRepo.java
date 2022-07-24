package com.example.BackAP.Repositorio;

import com.example.BackAP.Entidades.DatosUsuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DatosUsuarioRepo extends JpaRepository<DatosUsuario, Integer> {
}
