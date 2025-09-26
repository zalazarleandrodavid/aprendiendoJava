/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio6;

/**
 *
 * @author david
 */
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getters
    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }

    // Setters
    public void setNumero(int numero) { this.numero = numero; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + " personas]";
    }
}
