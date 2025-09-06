/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    void  mostrarInfo(){
    System.out.print(" El estudiante: " + nombre + " " + apellido + " en el curso " + curso + " " + " tiene esta calificacion " + " " + calificacion);
    }
    
    double subirCalificacion(double puntos){
                 if (puntos <= 10){
                 calificacion = calificacion + puntos;
                 }
            return calificacion;
    }
    
    double bajarCalificacion(double puntos){
    if (puntos > 0){
                 calificacion = calificacion - puntos;
                 }
            return calificacion;
    }
}
