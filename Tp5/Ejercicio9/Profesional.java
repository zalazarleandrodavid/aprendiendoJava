/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio9;

/**
 *
 * @author david
 */
public class Profesional {
    private String nombre;
    private String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String toString() {
        return "Profesional [nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }
}
