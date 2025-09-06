/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Clasificaciones {
    public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
        alumno.mostrarInfo();
        alumno.subirCalificacion(10);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(4);
        alumno.mostrarInfo();
    }
}
