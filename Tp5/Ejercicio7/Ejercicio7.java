/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio7;

/**
 *
 * @author david
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        // --- 1. Crear el Motor (Agregación) ---
        Motor motorDiesel = new Motor("Diesel", "D-190345");
        System.out.println("Motor creado: " + motorDiesel);

        // --- 2. Crear el Conductor (Asociación) ---
        Conductor diana = new Conductor("Diana Lopez", "A234YK");
        System.out.println("Conductor creado: " + diana);

        // --- 3. Crear el Vehículo, inyectando el Motor (Agregación) ---
        Vehiculo camioneta = new Vehiculo(
            "ABC-123", 
            "Toyota Hilux", 
            motorDiesel // Se pasa la instancia del Motor
        );
        System.out.println("\nVehículo creado (Agregación OK): " + camioneta);

        // --- 4. Establecer la Asociación Bidireccional ---
        camioneta.setConductor(diana);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Vehículo conoce al Conductor
        System.out.println("Vehículo " + camioneta.getPatente() + 
                           " -> Conductor: " + camioneta.getConductor().getNombre());
        
        // Verificación 2: Conductor conoce al Vehículo (Bidireccionalidad)
        System.out.println("Conductor " + diana.getNombre() + 
                           " -> Vehículo: " + diana.getVehiculo().getModelo());
        
        // Verificación 3: Acceso a la Agregación (Motor)
        System.out.println("Tipo de Motor: " + camioneta.getMotor().getTipo());
    }
}
