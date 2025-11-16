/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
public abstract class Figura {

    protected String nombre;

    // Constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto que debe ser implementado por todas las subclases. Es la
     * clave del Polimorfismo.
     * @return 
     */
    public abstract double calcularArea();

    /**
     * Getter para el nombre.
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
}
