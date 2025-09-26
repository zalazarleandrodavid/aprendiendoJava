/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio10;

/**
 *
 * @author david
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        // --- 1. Crear el Titular (Asociación) ---
        Titular raul = new Titular("Raúl Giménez", "30999000");
        System.out.println("Titular creado: " + raul);

        // --- 2. Crear la Cuenta Bancaria (Composición) ---
        // La ClaveSeguridad se crea *dentro* del constructor de la Cuenta.
        CuentaBancaria cuentaRaul = new CuentaBancaria(
            "0110456700000045678901", 
            55000.50, 
            "123456",     // Datos para la ClaveSeguridad (código)
            "2025-09-25"  // Datos para la ClaveSeguridad (última Modificación)
        );
        System.out.println("\nCuenta Bancaria creada (Composición OK): " + cuentaRaul);

        // --- 3. Establecer la Asociación Bidireccional ---
        cuentaRaul.setTitular(raul);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Cuenta conoce al Titular
        System.out.println("Cuenta: " + cuentaRaul.getCbu() + 
                           " -> Titular: " + cuentaRaul.getTitular().getNombre());
        
        // Verificación 2: Titular conoce a la Cuenta (Bidireccionalidad)
        System.out.println("Titular: " + raul.getNombre() + 
                           " -> Cuenta: " + raul.getCuenta().getCbu());
        
        // Verificación 3: Acceso a la Composición (ClaveSeguridad)
        System.out.println("Clave modificada por última vez: " + cuentaRaul.getClaveSeguridad().getUltimaModificacion());
    }
}
