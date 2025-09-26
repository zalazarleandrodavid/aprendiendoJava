/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio4;

/**
 *
 * @author david
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        // --- 1. Crear el Banco (Agregación) ---
        Banco bancoNacion = new Banco("Banco Argentino", "30-12345678-9");
        System.out.println("Banco creado: " + bancoNacion);

        // --- 2. Crear el Cliente (Asociación) ---
        Cliente diego = new Cliente("Diego Vega", "20123456");
        System.out.println("Cliente creado: " + diego);

        // --- 3. Crear la Tarjeta, inyectando el Banco (Agregación) ---
        TarjetaDeCredito tarjetaVisa = new TarjetaDeCredito(
            "4567-8901-2345-6789", 
            "12/28", 
            bancoNacion // Se pasa la instancia del Banco
        );
        System.out.println("\nTarjeta creada (Agregación OK): " + tarjetaVisa);

        // --- 4. Establecer la Asociación Bidireccional ---
        tarjetaVisa.setCliente(diego);
        System.out.println("\n--- Asociación Bidireccional Establecida ---");

        // Verificación 1: Tarjeta conoce al Cliente
        System.out.println("Tarjeta " + tarjetaVisa.getNumero() + 
                           " -> Cliente: " + tarjetaVisa.getCliente().getNombre());
        
        // Verificación 2: Cliente conoce a la Tarjeta (Bidireccionalidad)
        System.out.println("Cliente " + diego.getNombre() + 
                           " -> Tarjeta: " + diego.getTarjeta().getNumero());
        
        // Verificación 3: Acceso a la Agregación (Banco)
        System.out.println("La tarjeta pertenece al banco: " + tarjetaVisa.getBanco().getNombre());
    }
}
