/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio5;

/**
 *
 * @author david
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        // --- 1. Crear el Propietario (Asociación) ---
        Propietario elena = new Propietario("Maria Elena Fuseneco", "25000111");
        System.out.println("Propietario creado: " + elena);

        // --- 2. Crear la Computadora (Composición y Asociación) ---
        // La PlacaMadre se crea *dentro* del constructor de la Computadora.
        Computadora pcEscritorio = new Computadora(
            "HP", 
            "PCX-9987-AB", 
            "Asus Z590", // Datos para la PlacaMadre
            "Intel Z590"  // Datos para la PlacaMadre
        );
        System.out.println("\nComputadora creada (Composición OK): " + pcEscritorio);

        // --- 3. Establecer la Asociación Bidireccional ---
        pcEscritorio.setPropietario(elena);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Computadora conoce al Propietario
        System.out.println("Computadora " + pcEscritorio.getNumeroSerie() + 
                           " -> Propietario: " + pcEscritorio.getPropietario().getNombre());
        
        // Verificación 2: Propietario conoce a la Computadora (Bidireccionalidad)
        System.out.println("Propietario " + elena.getNombre() + 
                           " -> Computadora: " + elena.getComputadora().getMarca());
        
        // Verificación 3: Acceso a la Composición (PlacaMadre)
        System.out.println("Modelo de la Placa Madre: " + pcEscritorio.getPlacaMadre().getModelo());
    }
}
