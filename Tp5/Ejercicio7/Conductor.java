/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio7;

/**
 *
 * @author david
 */
public class Conductor {
    private String nombre;
    private String licencia;
    // Relación Bidireccional (1:1): Referencia al Vehículo
    private Vehiculo vehiculo; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getLicencia() { return licencia; }
    public Vehiculo getVehiculo() { return vehiculo; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    
    /**
     * Setter usado por la clase Vehiculo para manejar la bidireccionalidad.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor [nombre=" + nombre + ", licencia=" + licencia + "]";
    }
}
