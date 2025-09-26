/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio5;

/**
 *
 * @author david
 */
public class Propietario {
    private String nombre;
    private String dni;
    // Relación Bidireccional (1:1): Referencia a la Computadora
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    
    /**
     * Setter usado SOLO por la clase Computadora para manejar la bidireccionalidad.
     */
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
