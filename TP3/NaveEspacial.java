/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class NaveEspacial {
    String nombre;
    double combustible;
    
    void mostrarEstado(){
    System.out.print(" La Nave " + nombre +  " la cantidad de combustible es " + combustible);
    }
    
    void despegar() {
        if (combustible >= 10) { 
            combustible = combustible - 10;
            System.out.println(nombre + " ha despegado. Se usaron 10 unidades de combustible.");
        } else {
            System.out.println("¡Error! No hay suficiente combustible para despegar.");
        }
    }
    
     void avanzar(double distancia) {
        if (combustible >= distancia) {
            combustible = combustible - distancia;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades de distancia.");
        } else {
            System.out.println("¡Error! Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }
    
     void recargarCombustible(double cantidad){
         combustible = combustible + cantidad;
     }
    
}
