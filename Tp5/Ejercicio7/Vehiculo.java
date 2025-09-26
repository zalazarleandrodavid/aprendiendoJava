/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio7;

/**
 *
 * @author david
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    
    // Agregación (1:1): Se recibe el Motor
    private Motor motor; 
    
    // Asociación Bidireccional (1:1): Se vincula al Conductor
    private Conductor conductor; 

    /**
     * Constructor que inicializa los atributos y la Agregación (Motor).
     */
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Agregación: Asigna un Motor ya existente
    }

    // Getters
    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }

    // Setters
    public void setPatente(String patente) { this.patente = patente; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setMotor(Motor motor) { this.motor = motor; }
    
    /**
     * Setter para la Asociación Bidireccional con Conductor.
     */
    public void setConductor(Conductor nuevoConductor) {
        if (this.conductor != nuevoConductor) { 
            // 1. Limpiar el enlace en el Conductor anterior si existe
            if (this.conductor != null) {
                this.conductor.setVehiculo(null); 
            }
            
            // 2. Asociar el nuevo Conductor al Vehículo
            this.conductor = nuevoConductor;
            
            // 3. Establecer la bidireccionalidad: Asocia el Vehículo al nuevo Conductor
            if (nuevoConductor != null && nuevoConductor.getVehiculo() != this) {
                nuevoConductor.setVehiculo(this);
            }
        }
    }
    
    @Override
    public String toString() {
        String nombreConductor = (conductor != null) ? conductor.getNombre() : "Sin asignar";
        
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo + 
               ", motor=" + motor.getTipo() + ", conductor=" + nombreConductor + "]";
    }
}
