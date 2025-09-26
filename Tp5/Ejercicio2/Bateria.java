/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio2;

/**
 *
 * @author david
 */
public class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    // Getters
    public String getModelo() { return modelo; }
    public int getCapacidad() { return capacidad; }

    // Setters
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    @Override
    public String toString() {
        return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + " mAh]";
    }
}
