package com.mx.recetas.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="receta")
public class Receta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name ="id_receta")
    private int idReceta;
    @Column(name ="nombre")
    private String nombre;
    @Column(name ="edad")
    private int edad;
    @Column(name ="fecha")
    private Date fecha;
    @Column(name ="peso")
    private float peso;
    @Column(name ="alergias")
    private String alergias;
    @Column(name ="temperatura")
    private float temperatura;
    @Column(name ="diagnostico_medico")
    private String diagnosticoMedico;
    @Column(name ="tratamiento")
    private String tratamiento;

    public Receta(){

    }

    public Receta(int idReceta, String nombre, int edad, Date fecha, float peso, String alergias, float temperatura,
            String diagnosticoMedico, String tratamiento) {
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
        this.peso = peso;
        this.alergias = alergias;
        this.temperatura = temperatura;
        this.diagnosticoMedico = diagnosticoMedico;
        this.tratamiento = tratamiento;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getDiagnosticoMedico() {
        return diagnosticoMedico;
    }

    public void setDiagnosticoMedico(String diagnosticoMedico) {
        this.diagnosticoMedico = diagnosticoMedico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    

}
