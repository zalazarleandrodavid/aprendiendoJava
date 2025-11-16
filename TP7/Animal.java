/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
/**
 * Clase base que representa un Animal.
 */
public class Animal {
    protected String nombre;
    protected String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Método base para producir un sonido.
     * Este será sobrescrito en las subclases.
     */
    public void hacerSonido() {
        System.out.println("El animal " + nombre + " hace un sonido genérico.");
    }

    /**
     * Método para describir el animal. No será sobrescrito.
     */
    public void describirAnimal() {
        System.out.printf("Soy un %s y mi nombre es %s.\n", tipo, nombre);
    }
}