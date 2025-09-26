/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio4;

/**
 *
 * @author david
 */
public class Cliente {
    private String nombre;
    private String dni;
    // Relación Bidireccional (1:1): Referencia a la TarjetaDeCrédito
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    
    /**
     * Setter usado SOLO por la clase TarjetaDeCredito para manejar la bidireccionalidad.
     */
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
