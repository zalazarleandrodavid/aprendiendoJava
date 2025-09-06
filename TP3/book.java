/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class book {
    public static void main(String[] args) {
        Libro lib = new Libro();
       
        lib.setTitulo("El Principito");
        lib.setAutor("Antoine de Saint-Exupéry"); 
        lib.setañoPublicacion(1943);
        lib.mostrarInfo();
        
        System.out.println("\nIntentando cambiar a un año inválido (2030):");
        lib.setañoPublicacion(2030);
        
    }
}
