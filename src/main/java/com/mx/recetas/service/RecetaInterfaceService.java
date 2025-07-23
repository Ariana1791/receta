package com.mx.recetas.service;

import java.util.List;

import com.mx.recetas.model.Receta;

public interface RecetaInterfaceService {

    Receta crearReceta(Receta receta);

    List<Receta> buscarReceta();

    Receta actualizarReceta(Receta receta, int idReceta);

    void eliminarReceta(int idReceta);
}
