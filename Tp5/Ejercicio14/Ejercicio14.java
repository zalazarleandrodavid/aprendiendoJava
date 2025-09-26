/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio14;

/**
 *
 * @author david
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        // --- 1. Crear el Proyecto (Entidad base) ---
        Proyecto trailer = new Proyecto("Trailer Cine", 2.5);
        System.out.println("Entidad Proyecto: " + trailer);

        // --- 2. Crear el Editor de Video ---
        EditorVideo miEditor = new EditorVideo();
        System.out.println("\nEditor: " + miEditor);
        
        System.out.println("\n--- Ejecutando Dependencia de Creación ---");

        // DEPENDENCIA DE CREACIÓN: El método exportar() crea y retorna un Render.
        Render renderFinal = miEditor.exportar("MP4", trailer);
        
        System.out.println("\nObjeto creado por el Editor: " + renderFinal);
        
        System.out.println("\n--- Verificación de Relaciones ---");
        
        // Verificación 1: El objeto creado funciona correctamente
        System.out.println("Formato del render generado: " + renderFinal.getFormato());
        
        // Verificación 2: Asociación Unidireccional (Render conoce al Proyecto)
        System.out.println("Proyecto asociado al render: " + renderFinal.getProyecto().getNombre());

    }
}
