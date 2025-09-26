/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio4;

/**
 *
 * @author david
 */
public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCuit() { return cuit; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCuit(String cuit) { this.cuit = cuit; }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", cuit=" + cuit + "]";
    }
}
