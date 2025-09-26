/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio11;

/**
 *
 * @author david
 */
public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setGenero(String genero) { this.genero = genero; }

    @Override
    public String toString() {
        return "Artista [nombre=" + nombre + ", genero=" + genero + "]";
    }
}
