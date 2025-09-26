/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio11;

/**
 *
 * @author david
 */
public class Reproductor {
    private String estado = "Apagado";

    // Constructor (vacío, solo para el ejemplo)
    public Reproductor() {
        // Inicialización simple
    }

    // Setter (para demostrar que la dependencia NO es un atributo)
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * DEPENDENCIA DE USO: La clase Reproductor utiliza la clase Cancion
     * como parámetro, pero no guarda una referencia a ella.
     */
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            String infoCancion = cancion.getTitulo() + " de " + cancion.getArtista().getNombre();
            this.estado = "Reproduciendo";
            System.out.println(" Reproductor: " + estado + " -> " + infoCancion);
        } else {
            System.out.println(" Reproductor: No se puede reproducir una canción nula.");
        }
    }
    
    @Override
    public String toString() {
        return "Reproductor [estado actual=" + estado + "]";
    }
}
