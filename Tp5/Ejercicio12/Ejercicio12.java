/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio12;

/**
 *
 * @author david
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        // --- 1. Crear las Entidades de la Asociación ---
        
        // Contribuyente (Destino de la Asociación)
        Contribuyente juan = new Contribuyente("Juan López", "20-12345678-9");
        System.out.println("Entidad Contribuyente: " + juan);

        // Impuesto (Crea la Asociación Unidireccional)
        Impuesto iva = new Impuesto(1000.00, juan);
        System.out.println("Entidad Impuesto: " + iva);

        // --- 2. Crear la Calculadora ---
        Calculadora miCalculadora = new Calculadora();
        System.out.println("\nEstado inicial: " + miCalculadora);
        
        System.out.println("\n--- Ejecutando Dependencia de Uso ---");

        // DEPENDENCIA DE USO: El objeto miCalculadora usa el objeto iva solo para el método calcular()
        miCalculadora.calcular(iva);
        
        System.out.println("\n--- Verificación de Relaciones ---");
        
        // Verificación 1: Asociación Unidireccional
        System.out.println("El impuesto conoce al contribuyente: " + iva.getContribuyente().getNombre());
        
    }
}
