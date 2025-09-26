/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio6;

/**
 *
 * @author david
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        // --- 1. Crear las Entidades Independientes (Agregación y Asociación) ---
        
        // Mesa (Agregación: Existe independientemente)
        Mesa mesaVIP = new Mesa(10, 4);
        System.out.println("Entidad Mesa: " + mesaVIP);

        // Cliente (Asociación Unidireccional: Existe independientemente)
        Cliente yoli = new Cliente("Yolanda Pérez", "555-1234");
        System.out.println("Entidad Cliente: " + yoli);

        // --- 2. Crear la Reserva (Une las entidades) ---
        Reserva reservaJavier = new Reserva(
            "2025-10-20", 
            "21:00", 
            yoli,     // Asociación Unidireccional
            mesaVIP     // Agregación
        );
        System.out.println("\nReserva creada: " + reservaJavier);
        
        System.out.println("\n--- Verificación de Relaciones ---");

        // Verificación 1: Reserva conoce al Cliente (Unidireccional)
        System.out.println("Reserva para el cliente: " + reservaJavier.getCliente().getNombre());
        
        // Verificación 2: Reserva conoce la Mesa (Agregación)
        System.out.println("Mesa asignada: " + reservaJavier.getMesa().getNumero() + 
                           " (Capacidad: " + reservaJavier.getMesa().getCapacidad() + ")");
        

    }
}
