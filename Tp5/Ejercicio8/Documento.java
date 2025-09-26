/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio8;

/**
 *
 * @author david
 */
public class Documento {
    private String titulo;
    private String contenido;
    
    // Composición (1:1): El Documento es dueño de la FirmaDigital
    private FirmaDigital firmaDigital; 

    /**
     * Constructor que inicializa los atributos y la Composición (FirmaDigital).
     * Nota: Recibimos los datos de la firma Y el objeto Usuario (Agregación).
     */
    public Documento(String titulo, String contenido, String codigoHashFirma, String fechaFirma, Usuario usuarioFirmante) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        // COMPOSICIÓN: La FirmaDigital se crea dentro del Documento.
        // AGREGACIÓN: El objeto UsuarioFirmante se pasa a la FirmaDigital.
        this.firmaDigital = new FirmaDigital(codigoHashFirma, fechaFirma, usuarioFirmante);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirmaDigital() { return firmaDigital; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public void setFirmaDigital(FirmaDigital firmaDigital) { this.firmaDigital = firmaDigital; } // Setter para la Composición
    
    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido.substring(0, Math.min(contenido.length(), 20)) + "..." + 
               ", firma=" + firmaDigital.getCodigoHash() + "]";
    }
}
