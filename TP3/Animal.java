/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Animal {
    public static void main(String[] args) {
        Mascota compa = new Mascota();
        compa.nombre = "Alan";
        compa.especie = "Felina";
        compa.edad = 3;
        
        compa.mostrarInfo();
        
        compa.cumplirAnios(1);
        
        compa.mostrarInfo();
        
        
        
    }
}
