/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio7;

/**
 *
 * @author david
 */
public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Getters
    public String getTipo() { return tipo; }
    public String getNumeroSerie() { return numeroSerie; }

    // Setters
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    @Override
    public String toString() {
        return "Motor [tipo=" + tipo + ", numeroSerie=" + numeroSerie + "]";
    }
}
