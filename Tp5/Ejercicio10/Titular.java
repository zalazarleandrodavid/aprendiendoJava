/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio10;

/**
 *
 * @author david
 */
public class Titular {
    private String nombre;
    private String dni;
    // Relación Bidireccional (1:1): Referencia a la CuentaBancaria
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    
    /**
     * Setter usado por la clase CuentaBancaria para manejar la bidireccionalidad.
     */
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
