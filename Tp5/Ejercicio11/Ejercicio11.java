/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio11;

/**
 *
 * @author david
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        // --- 1. Crear las Entidades Independientes ---
        
        // Artista (Destino de la Asociación)
        Artista queen = new Artista("Queen", "Rock");
        System.out.println("Entidad Artista: " + queen);

        // Canción (Crea la Asociación Unidireccional)
        Cancion bohemian = new Cancion("Bohemian Rhapsody", queen);
        System.out.println("Entidad Canción: " + bohemian);

        // --- 2. Crear el Reproductor ---
        Reproductor miReproductor = new Reproductor();
        System.out.println("\nEstado inicial: " + miReproductor);
        
        System.out.println("\n--- Ejecutando Dependencia de Uso ---");

        // DEPENDENCIA DE USO: El Reproductor usa la Canción para su método
        miReproductor.reproducir(bohemian);
        
        // Verificación 1: El Reproductor ejecutó su método y cambió su estado
        System.out.println("\nEstado después de usar la Canción: " + miReproductor);

    }
}
