/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio10;

/**
 *
 * @author david
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    
    // Composición (1:1): La Cuenta es dueña de la ClaveSeguridad
    private ClaveSeguridad claveSeguridad; 
    
    // Asociación Bidireccional (1:1): El Titular
    private Titular titular; 

    /**
     * Constructor que inicializa los atributos y la Composición (ClaveSeguridad).
     */
    public CuentaBancaria(String cbu, double saldoInicial, String codigoClave, String fechaModifClave) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        
        // COMPOSICIÓN: La ClaveSeguridad se crea dentro del constructor de la Cuenta.
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaModifClave);
    }

    // Getters
    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }

    // Setters
    public void setCbu(String cbu) { this.cbu = cbu; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) { this.claveSeguridad = claveSeguridad; }
    
    /**
     * Setter para la Asociación Bidireccional con Titular.
     */
    public void setTitular(Titular nuevoTitular) {
        if (this.titular != nuevoTitular) { 
            // 1. Limpiar el enlace en el Titular anterior si existe
            if (this.titular != null) {
                this.titular.setCuenta(null); 
            }
            
            // 2. Asociar el nuevo Titular a la Cuenta
            this.titular = nuevoTitular;
            
            // 3. Establecer la bidireccionalidad: Asocia la Cuenta al nuevo Titular
            if (nuevoTitular != null && nuevoTitular.getCuenta() != this) {
                nuevoTitular.setCuenta(this);
            }
        }
    }
    
    @Override
    public String toString() {
        String nombreTitular = (titular != null) ? titular.getNombre() : "Sin asignar";
        
        return "CuentaBancaria [CBU=" + cbu + ", saldo=" + saldo + 
               ", clave=" + claveSeguridad.getCodigo() + 
               ", titular=" + nombreTitular + "]";
    }
}
