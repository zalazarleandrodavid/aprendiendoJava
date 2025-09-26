/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio3;

/**
 *
 * @author david
 */
public class Autor {
     private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    @Override
    public String toString() {
        return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }
}
