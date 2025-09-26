/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio5;

/**
 *
 * @author david
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;

    // Se inicializa con los datos esenciales
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getters
    public String getModelo() { return modelo; }
    public String getChipset() { return chipset; }

    // Setters
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setChipset(String chipset) { this.chipset = chipset; }

    @Override
    public String toString() {
        return "PlacaMadre [modelo=" + modelo + ", chipset=" + chipset + "]";
    }
}
