/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio8;

/**
 *
 * @author david
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        // --- 1. Crear el Usuario (Agregación) ---
        Usuario director = new Usuario(" Alejandro Dumas ", "aledumas@empresa.com");
        System.out.println("Usuario creado: " + director);

        // --- 2. Crear el Documento (Composición y Agregación) ---
        // La FirmaDigital se crea internamente en Documento, recibiendo el Usuario.
        Documento informe = new Documento(
            "Informe Anual Q3", 
            "El presente informe detalla los resultados operativos...", 
            "A8B3C4D5E6F7",     // Código Hash de la Firma
            "2025-09-23",       // Fecha de la Firma
            director            // Objeto Usuario para la Agregación
        );
        System.out.println("\nDocumento creado: " + informe);

        System.out.println("\n--- Verificación de Relaciones ---");

        // Verificación 1: Acceso a la Composición (FirmaDigital)

        System.out.println("Hash de la Firma: " + informe.getFirmaDigital().getCodigoHash());
        
        // Verificación 2: Acceso a la Agregación (Usuario Firmante) a través de la Firma
 
        System.out.println("Firmado por: " + informe.getFirmaDigital().getUsuario().getNombre());
        
        // Nota: Si el Documento (y su FirmaDigital) se destruye, el objeto Usuario Director sigue existiendo. (Agregación OK).
    }
}
