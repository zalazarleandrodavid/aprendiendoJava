/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio14;

/**
 *
 * @author david
 */
public class Proyecto {
    private String nombre;
    private double duracionMin;

    public Proyecto(String nombre, double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getDuracionMin() { return duracionMin; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDuracionMin(double duracionMin) { this.duracionMin = duracionMin; }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", duracionMin=" + duracionMin + "]";
    }
}
