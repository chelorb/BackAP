package com.example.BackAP.Repositorio;

import com.example.BackAP.Entidades.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Integer> {
    void delete(Integer id);
};
