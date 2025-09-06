/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Nave {
    public static void main(String[] args) {
        NaveEspacial miNave = new NaveEspacial();

        // Asignar los valores iniciales
        miNave.nombre = " Sapukay ";
        miNave.combustible = 50.0;

        System.out.println("--- Estado Inicial ---");
        miNave.mostrarEstado();

        // 1. Intentar avanzar sin suficiente combustible
        
        System.out.println("\n--- Despegar ---");
        miNave.despegar();
        
        System.out.println("\n--- Intento de avance sin recargar ---");
        miNave.avanzar(60.0);

        // 2. Recargar combustible
        System.out.println("\n--- Recargando combustible ---");
        miNave.recargarCombustible(30.0);

        // 3. Ahora que hay suficiente, avanzar
        System.out.println("\n--- Avanzando después de recargar ---");
        miNave.avanzar(60.0);
        
        // 4. Mostrar el estado final
        System.out.println("\n--- Estado Final ---");
        miNave.mostrarEstado();
        
        
    }
}
