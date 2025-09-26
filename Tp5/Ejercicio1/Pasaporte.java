/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1;

/**
 *
 * @author david
 */
public class Pasaporte {
    // Atributos
    private String numero;
    private String fechaEmision; // Usando String en lugar de LocalDate
    
    // Relación de Composición (1:1): Foto
    private Foto foto; 
    
    // Relación de Asociación Bidireccional (1:1): Titular
    private Titular titular; 

    // Constructor que inicializa atributos, incluyendo la Composición (Foto)
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Inicialización de la Composición: La Foto se crea aquí
        this.foto = new Foto(imagen, formato); 
    }

    // Getters y Setters
    public String getNumero() { 
        return numero; 
    }
    public void setNumero(String numero) {
        this.numero = numero; 
    }
    public String getFechaEmision() { 
        return fechaEmision; 
    }
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision; 
    }

    // Getters para las relaciones
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    /**
     * Establece el Titular y maneja la bidireccionalidad de la Asociación (1:1).
     */
    public void setTitular(Titular titular) {
        if (this.titular != titular) { 
            // 1. Desasociar el Pasaporte del Titular anterior si existe
            if (this.titular != null) {
                this.titular.setPasaporte(null); 
            }
            
            // 2. Asociar el nuevo Titular al Pasaporte
            this.titular = titular;
            
            // 3. Establecer la bidireccionalidad
            if (titular != null && titular.getPasaporte() != this) {
                titular.setPasaporte(this);
            }
        }
    }
    
    @Override
   public String toString() {
    
    String infoTitular;

    if (titular != null) {
        infoTitular = titular.getNombre(); 
    } else {
        infoTitular = "Sin titular asignado";
    }
    //Devolvemos la cadena completa del Pasaporte, usando el valor ya determinado.
    return "Pasaporte [numero=" + numero + 
           ", fechaEmision=" + fechaEmision + 
           ", foto=" + foto.toString() + 
           ", titular=" + infoTitular + "]";
}
}
