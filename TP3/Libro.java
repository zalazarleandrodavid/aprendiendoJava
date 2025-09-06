/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    void  mostrarInfo(){
    System.out.print(" El Libro se llama : " + titulo +  " su autor es " + autor + " su año de publicon es " + añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getañoPublicacion() {
        return añoPublicacion;
    }
    
    public void setTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }

    public void setAutor(String nuevoAutor) {
        autor = nuevoAutor;
    }
    
    public void setañoPublicacion(int nuevoAnio) {
        // Validar que el año sea un valor positivo y razonable (ej. hasta el año actual)
        if (nuevoAnio > 0 && nuevoAnio <= 2025) { 
            añoPublicacion = nuevoAnio;
            System.out.println("El año de publicación ha sido actualizado a " + nuevoAnio);
        } else {
            System.out.println("Error: El año de publicación " + nuevoAnio + " es inválido.");
        }
    }
}
