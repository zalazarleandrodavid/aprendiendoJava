/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio2;

/**
 *
 * @author david
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    
    // Relación de Agregación (1:1)
    private Bateria bateria; 
    
    // Relación de Asociación Bidireccional (1:1)
    private Usuario usuario; 

    /**
     * Constructor que incluye la Batería (Agregación).
     */
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; 
    }

    // Getters
    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }

    // Setters
    public void setImei(String imei) { this.imei = imei; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setBateria(Bateria bateria) { this.bateria = bateria; }
    
    /**
     * Setter para la Asociación Bidireccional.
     */
    public void setUsuario(Usuario nuevoUsuario) {
        if (this.usuario != nuevoUsuario) { 
            // 1. Limpiar el enlace bidireccional en el Usuario anterior si existe
            if (this.usuario != null) {
                this.usuario.setCelular(null); 
            }
            
            // 2. Asociar el nuevo Usuario al Celular
            this.usuario = nuevoUsuario;
            
            // 3. Establecer la bidireccionalidad: Asocia el Celular al nuevo Usuario
            if (nuevoUsuario != null && nuevoUsuario.getCelular() != this) {
                nuevoUsuario.setCelular(this);
            }
        }
    }
    
    @Override
    public String toString() {
        // Usamos el getter en la validación
        String infoUsuario;
        if (usuario != null) {
            infoUsuario = usuario.getNombre();
        } else {
            infoUsuario = "Sin asignar";
        }
        
        return "Celular [imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + 
               ", bateria=" + bateria.toString() + ", usuario=" + infoUsuario + "]";
    }
}
