/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio6;

/**
 *
 * @author david
 */
public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", telefono=" + telefono + "]";
    }
}
