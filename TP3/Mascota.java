/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void  mostrarInfo(){
    System.out.print(" El nombre de la mascota es: " + nombre + " y su especie es " + especie + " acaba de cumplir años y tiene ahora " + edad);
    }
    
    int cumplirAnios(int anio){
    edad = edad + anio;
    return edad;
    }
}
