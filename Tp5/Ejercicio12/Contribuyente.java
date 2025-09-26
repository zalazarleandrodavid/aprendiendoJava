/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio12;

/**
 *
 * @author david
 */
public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCuil(String cuil) { this.cuil = cuil; }

    @Override
    public String toString() {
        return "Contribuyente [nombre=" + nombre + ", cuil=" + cuil + "]";
    }
}
