/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1;

/**
 *
 * @author david
 */
public class Foto {
    // Atributos
    private String imagen; 
    private String formato;

    // CONSTRUCTOR (Correcto: acepta dos Strings)
    public Foto(String imagenBase64, String formato) {
        this.imagen = imagenBase64;// String para simular la imagen (ej: codificada en Base64)
        this.formato = formato;
    }

    // Getters y Setters
    public String getImagen() { return imagen; }
    public void setImagenBase64(String imagenBase64) { this.imagen = imagenBase64; }
    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }
    
    @Override
    public String toString() {
        String longitud;

        // VERIFICACIÓN CLAVE: Más legible y segura
        if (imagen != null) {
            int tamano = imagen.length();
            longitud = tamano + " caracteres"; 
        } else {
            // Esto EVITA el error NullPointerException
            longitud = "0 caracteres";
        }
        
        return "Foto [formato=" + formato + ", tamanioSimulado=" + longitud + "]";
    }
} // Solo una llave de cierre para la clase Foto
