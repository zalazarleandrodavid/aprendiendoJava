/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
public class Rectangulo extends Figura{

    private double base;
    private double altura;

    // Constructor

    /**
     *
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        // Llama al constructor de la clase base y asigna el nombre
        super("Rectangulo");
        this.base = base;
        this.altura = altura;

    }

    /**
     * Implementación obligatoria del método abstracto.
     * @return 
     */
    @Override
    public double calcularArea() {
        // Área = base * altura
        return base * altura;
    }
}
