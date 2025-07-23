package com.mx.recetas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.recetas.model.Receta;
import com.mx.recetas.repository.RecetaInterfaceRepository;

@Service
public class RecetaServiceImpl implements RecetaInterfaceService{

    @Autowired
    RecetaInterfaceRepository repository;

    @Override
    public Receta crearReceta(Receta receta) {
        Receta result = null;
        try {
            result = repository.save(receta);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


    @Override
    public List<Receta> buscarReceta() {
        List<Receta> resultado = null;
        try {
            resultado = repository.findAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

     @Override
    public Receta actualizarReceta(Receta receta, int idReceta) {
       Receta guardar = new Receta();
        try {
            boolean recuperado = repository.existsById(idReceta);
            if (recuperado == true) {
                guardar.setIdReceta(idReceta);
                guardar.setNombre(receta.getNombre());
                guardar.setEdad(receta.getEdad());
                guardar.setFecha(receta.getFecha());
                guardar.setPeso(receta.getPeso());
                guardar.setAlergias(receta.getAlergias());
                guardar.setTemperatura(receta.getTemperatura());
                guardar.setDiagnosticoMedico(receta.getDiagnosticoMedico());
                guardar.setTratamiento(receta.getTratamiento());
                guardar = repository.save(guardar);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return guardar;
    }

     @Override
    public void eliminarReceta(int idReceta) {
        {
            int id = (int) idReceta;
            try{
            repository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

}
