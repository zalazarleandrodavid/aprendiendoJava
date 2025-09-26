/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio9;

/**
 *
 * @author david
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        // --- 1. Crear las Entidades Independientes ---
        
        // Paciente (Destino de la Asociación)
        Paciente sofia = new Paciente("Sofía Ruiz", "OSDE");
        System.out.println("Entidad Paciente: " + sofia);

        // Profesional (Destino de la Asociación)
        Profesional draJuguete = new Profesional("Dra. Ana Juguete", "Pediatría");
        System.out.println("Entidad Profesional: " + draJuguete);

        // --- 2. Crear la Cita Médica (Conecta las entidades) ---
        CitaMedica cita1 = new CitaMedica(
            "2025-10-30", 
            "16:30", 
            sofia,      // Asociación Unidireccional 1
            draJuguete      // Asociación Unidireccional 2
        );
        System.out.println("\nCita Médica creada: " + cita1);
        
        System.out.println("\n--- Verificación de Relaciones ---");

        // Verificación 1: Cita conoce al Paciente
        System.out.println("Cita para el paciente: " + cita1.getPaciente().getNombre() + 
                           " (Obra Social: " + cita1.getPaciente().getObraSocial() + ")");
        
        // Verificación 2: Cita conoce al Profesional
        System.out.println("Cita con el profesional: " + cita1.getProfesional().getNombre() + 
                           " (Especialidad: " + cita1.getProfesional().getEspecialidad() + ")");
        
        // Verificación 3: Las entidades destino no tienen referencias de vuelta (Unidireccional OK)
    }
}
