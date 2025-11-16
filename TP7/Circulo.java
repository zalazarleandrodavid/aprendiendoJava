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
 * Subclase que representa un Círculo.
 */
public class Circulo extends Figura {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        // Llama al constructor de la clase base y asigna el nombre
        super("Círculo"); 
        this.radio = radio;
    }

    /**
     * Implementación obligatoria del método abstracto.
     */
    @Override
    public double calcularArea() {
        // Área = π * radio^2
        return Math.PI * radio * radio;
    }
}