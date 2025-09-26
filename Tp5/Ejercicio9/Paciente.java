/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio9;

/**
 *
 * @author david
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setObraSocial(String obraSocial) { this.obraSocial = obraSocial; }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", obraSocial=" + obraSocial + "]";
    }
}
