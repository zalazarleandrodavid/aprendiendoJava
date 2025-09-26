/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio2;

/**
 *
 * @author david
 */
public class Usuario {
    private String nombre;
    private String dni;
    // Relación Bidireccional (1:1): Referencia al Celular
    private Celular celular; 

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    
    /**
     * Setter para manejar la bidireccionalidad.
     */
    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
