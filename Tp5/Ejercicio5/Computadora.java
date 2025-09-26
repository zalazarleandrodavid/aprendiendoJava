/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio5;

/**
 *
 * @author david
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    
    // Composición (1:1): La Computadora crea y es dueña de la PlacaMadre
    private PlacaMadre placaMadre; 
    
    // Asociación Bidireccional (1:1): El Propietario
    private Propietario propietario; 

    /**
     * Constructor que inicializa los atributos y la Composición (PlacaMadre).
     */
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
        // COMPOSICIÓN: La PlacaMadre se crea dentro del constructor de la Computadora.
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    // Getters
    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    // Setters
    public void setMarca(String marca) { this.marca = marca; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public void setPlacaMadre(PlacaMadre placaMadre) { this.placaMadre = placaMadre; }
    
    /**
     * Setter para la Asociación Bidireccional con Propietario.
     */
    public void setPropietario(Propietario nuevoPropietario) {
        if (this.propietario != nuevoPropietario) { 
            // 1. Limpiar el enlace en el Propietario anterior si existe
            if (this.propietario != null) {
                this.propietario.setComputadora(null); 
            }
            
            // 2. Asociar el nuevo Propietario a la Computadora
            this.propietario = nuevoPropietario;
            
            // 3. Establecer la bidireccionalidad: Asocia la Computadora al nuevo Propietario
            if (nuevoPropietario != null && nuevoPropietario.getComputadora() != this) {
                nuevoPropietario.setComputadora(this);
            }
        }
    }
    
    @Override
    public String toString() {
        String nombrePropietario = (propietario != null) ? propietario.getNombre() : "Sin asignar";
        
        return "Computadora [marca=" + marca + ", serie=" + numeroSerie + 
               ", placa=" + placaMadre.getModelo() + 
               ", propietario=" + nombrePropietario + "]";
    }
}
