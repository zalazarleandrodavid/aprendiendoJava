/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1;

/**
 *
 * @author david
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // 1. Crear el Titular
        Titular ana = new Titular("Juan Cruz", "20987654Z");
        
        // 2. Crear datos para la Composición (Foto) como String
        String datosFotoAna = "qwqwqkjwk"; 
        
        // 3. Crear el Pasaporte, usando String para la fecha
        Pasaporte pasaporteAna = new Pasaporte(
            "P123456789", 
            "1999-01-15", // Fecha como String
            datosFotoAna, 
            "PNG"
        );

        System.out.println("Pasaporte creado (Composición OK): " + pasaporteAna);

        // 4. Establecer la Asociación Bidireccional
        pasaporteAna.setTitular(ana);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Pasaporte conoce al Titular
        System.out.println("Pasaporte " + pasaporteAna.getNumero() + " tiene Titular: " + pasaporteAna.getTitular().getNombre());
        
        // Verificación 2: Titular conoce al Pasaporte
        System.out.println("Titular " + ana.getNombre() + " tiene Pasaporte: " + ana.getPasaporte().getNumero());
        
        // Verificación 3: Acceso a la Composición (Foto)
        System.out.println("Formato de la Foto: " + pasaporteAna.getFoto().getFormato());
    }
}