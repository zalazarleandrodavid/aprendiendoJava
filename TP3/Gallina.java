/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    void mostrarEstado(){
    System.out.print(" El id de la gallina es : " + idGallina +  " su edad es " + edad + " y a puesto " + huevosPuestos + " Huevos ");
    }
    
    void ponerHuevo(int huevos){
    huevosPuestos = huevosPuestos + huevos;
    }
    
    int envejecer(int dias){
    if (edad > 0){
        edad = edad + dias;
        
    }
    return edad;
    }
}
