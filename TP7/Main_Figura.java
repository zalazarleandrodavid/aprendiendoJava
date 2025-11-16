/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Main_Figura {

    public static void main(String[] args) {

        List<Figura> figuras = new ArrayList<>();

        // Añadimos subclases concretas al array (Polimorfismo).
        figuras.add(new Circulo(5.0)); // Radio 5
        figuras.add(new Rectangulo(4.0, 6.0)); // Base 4, Altura 6
        figuras.add(new Circulo(2.5)); // Radio 2.5
        figuras.add(new Rectangulo(10.0, 3.0)); // Base 10, Altura 3

        System.out.println("--- Cálculo de Área para el Array de Figuras ---");

        // Tarea: Mostrar el área de cada una usando polimorfismo.
        for (Figura figura : figuras) {
            // El polimorfismo garantiza que se llama al calcularArea()
            // correcto para Círculo o Rectángulo en tiempo de ejecución.
            double area = figura.calcularArea();

            // Usamos String.format para limitar los decimales del área.
            System.out.printf("%s: Área = %.2f\n", figura.getNombre(), area);
        }

        
    }
}
