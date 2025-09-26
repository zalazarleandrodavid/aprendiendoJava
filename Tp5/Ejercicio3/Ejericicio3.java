/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio3;

/**
 *
 * @author david
 */
public class Ejericicio3 {
    public static void main(String[] args) {
        // 1. Crear la Editorial (Existe independientemente)
        Editorial editorialUno = new Editorial("Santillana", "Calle Independencia 1234");
        System.out.println("Entidad 1 creada: " + editorialUno);

        // 2. Crear el Autor
        Autor autorUno = new Autor("Paturuzu", "Argentino");
        System.out.println("Entidad 2 creada: " + autorUno);

        // 3. Crear el Libro, inyectando el Autor y la Editorial
        // (Agregación y Asociación Unidireccional se establecen aquí)
        Libro libroA = new Libro(
            "Las aventuras de paturuzu", 
            "978-0307474479", 
            autorUno, 
            editorialUno
        );
        System.out.println("\nLibro creado: " + libroA);
        
        System.out.println("\n--- Verificación de Relaciones ---");

        // Verificación 1: Libro conoce al Autor (Unidireccional)
        // Usamos el getter de Libro para acceder al getter de Autor
        System.out.println("Título: " + libroA.getTitulo());
        System.out.println("  -> Autor: " + libroA.getAutor().getNombre());
        
        // Verificación 2: Libro conoce la Editorial (Agregación)
        System.out.println("  -> Editorial: " + libroA.getEditorial().getNombre());

    }
}
