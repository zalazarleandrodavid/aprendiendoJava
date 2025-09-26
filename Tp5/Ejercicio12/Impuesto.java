/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio12;

/**
 *
 * @author david
 */
public class Impuesto {
    private double monto;
    
    // Asociación Unidireccional (Impuesto -> Contribuyente)
    private Contribuyente contribuyente; 

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    // Getters
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    // Setters
    public void setMonto(double monto) { this.monto = monto; }
    public void setContribuyente(Contribuyente contribuyente) { this.contribuyente = contribuyente; }
    
    @Override
    public String toString() {
        String nombreContribuyente = (contribuyente != null) ? contribuyente.getNombre() : "N/A";
        return "Impuesto [monto=" + monto + ", contribuyente=" + nombreContribuyente + "]";
    }
}
