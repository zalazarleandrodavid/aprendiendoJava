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
public class Main_Animal {

    public static void main(String[] args) {

        // Tarea: Crear lista de animales.
        List<Animal> granja = new ArrayList<>();

        // Añadimos subclases a la lista de la clase base Animal (Polimorfismo)
        granja.add(new Perro("Fido"));
        granja.add(new Gato("Misifú"));
        granja.add(new Vaca("Lola"));
        granja.add(new Perro("Jacky"));
        granja.add(new Animal("Otro", "Animal Desconocido")); // Para ver el comportamiento base

        System.out.println("--- Sonidos de la Granja (Polimorfismo) ---");

        // Tarea: Mostrar sus sonidos con polimorfismo.
        for (Animal animal : granja) {
            // Se llama al método sobrescrito específico para cada objeto.
            animal.hacerSonido();
        }

        System.out.println("\n--- Descripciones ---");

        // Llamando a un método no sobrescrito (comportamiento heredado)
        for (Animal animal : granja) {
            animal.describirAnimal();
        }
    }
}
