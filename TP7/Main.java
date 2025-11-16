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
 * Clase principal para probar la herencia y el polimorfismo.
 */
public class Main {

    public static void main(String[] args) {
        // Tarea: Instanciar un auto

        Auto miAuto = new Auto("Toyota", "Corolla 2024", 4);

        System.out.println("\nLlamando a miAuto.mostrarInfo():");

        // Tarea: Mostrar su información completa.
        // Se ejecuta el método sobrescrito en la clase Auto (Polimorfismo).
        miAuto.mostrarInfo();

        Vehiculo miVehiculo = new Vehiculo("Honda", "CRV 2023");

        System.out.println("\nLlamando a miVehiculo.mostrarInfo():");
        miVehiculo.mostrarInfo();
    }
}
