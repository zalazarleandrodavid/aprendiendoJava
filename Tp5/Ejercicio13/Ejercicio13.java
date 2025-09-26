/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio13;

/**
 *
 * @author david
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        // --- 1. Crear el Usuario (Entidad base) ---
        Usuario clienteA = new Usuario("Martín Velez", "mvelez@datos.net");
        System.out.println("Entidad Usuario: " + clienteA);

        // --- 2. Crear el GeneradorQR ---
        GeneradorQR miGenerador = new GeneradorQR();
        System.out.println("\nGenerador: " + miGenerador);
        
        System.out.println("\n--- Ejecutando Dependencia de Creación ---");

        // DEPENDENCIA DE CREACIÓN: El método generar() crea y retorna un CodigoQR.
        CodigoQR codigoA = miGenerador.generar("Clave123A", clienteA);
        
        System.out.println("\nObjeto creado por el Generador: " + codigoA);
        
        System.out.println("\n--- Verificación de Relaciones ---");
        
        // Verificación 1: El objeto creado funciona correctamente
        System.out.println("Valor del QR: " + codigoA.getValor());
        
        // Verificación 2: Asociación Unidireccional (CódigoQR conoce al Usuario)
        System.out.println("QR asociado a: " + codigoA.getUsuario().getEmail());

    }
}
