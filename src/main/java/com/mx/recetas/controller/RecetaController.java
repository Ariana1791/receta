package com.mx.recetas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mx.recetas.model.Receta;
import com.mx.recetas.service.RecetaInterfaceService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class RecetaController {

    @Autowired
    RecetaInterfaceService service;

@PostMapping(value ="/crearReceta")
    public ResponseEntity <?> crearReceta(@RequestBody Receta receta) {
       Receta crear = null;
         try {
            crear = service.crearReceta(receta);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        
        return crear;
    }

    @PostMapping(value = "/buscarReceta")
    public List<Receta> buscarReceta() {
        List<Receta> buscar = null;
        try {
            buscar = service.buscarReceta();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return buscar;
    }

    @PutMapping(value = "/actualizarReceta/{idReceta}")
    public Receta actualizarReceta(@RequestBody Receta receta, @PathVariable int idReceta) {
        Receta actualizar = null;
        try {
            actualizar = service.actualizarReceta(receta, idReceta);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return actualizar;
    }

    @DeleteMapping(value = "/eliminarReceta/{idReceta}")
    public void eliminarReceta(@PathVariable int idReceta) {

        try {
            service.eliminarReceta(idReceta);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}

