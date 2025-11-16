/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
public abstract class Empleado {
    protected String nombre;
    protected String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Método abstracto para calcular el sueldo.
     * Cada subclase lo implementará de forma distinta.
     * @return 
     */
    public abstract double calcularSueldo();

    // Método para mostrar información común
    public void mostrarInfoBase() {
        System.out.printf("  - ID: %s, Nombre: %s\n", id, nombre);
    }
}