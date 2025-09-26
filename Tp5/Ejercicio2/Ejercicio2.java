/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio2;

/**
 *
 * @author david
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // --- 1. Crear la Entidad de Agregación (Batería) ---
        Bateria bateriacomun = new Bateria("Li-Ion-3500", 3500);
        
        // --- 2. Crear el Usuario ---
        Usuario carlos = new Usuario("Luis Miguel", "10203040C");

        // --- 3. Crear el Celular e inyectar la Batería (Agregación) ---
        Celular motorola = new Celular(
            "5789452346", 
            "Motorola", 
            "edge 50", 
            bateriacomun 
        );
        System.out.println("Celular creado: " + motorola);

        // --- 4. Establecer la Asociación Bidireccional (Usando el setter) ---
       motorola.setUsuario(carlos);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Celular conoce al Usuario
        System.out.println("Celular: " + motorola.getModelo() + 
                           " -> Usuario: " + motorola.getUsuario().getNombre());
        
        // Verificación 2: Usuario conoce al Celular (bidireccionalidad)
        System.out.println("Usuario: " + carlos.getNombre() + 
                           " -> Celular: " + carlos.getCelular().getImei());
        
        // Verificación 3: Acceso a la Agregación (Batería)
        System.out.println("Modelo de la batería: " + motorola.getBateria().getModelo());
    }
}
