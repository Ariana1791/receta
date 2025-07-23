package com.mx.recetas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.recetas.model.Receta;

public interface RecetaInterfaceRepository extends JpaRepository<Receta, Integer> {

}
