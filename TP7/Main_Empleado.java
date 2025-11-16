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
public class Main_Empleado {

    public static void main(String[] args) {

        // Tarea: Crear lista de empleados de tipo Empleado (Polimorfismo).
        List<Empleado> nomina = new ArrayList<>();

        // Llenar la lista con diferentes tipos de subclases
        nomina.add(new EmpleadoPlanta("Ana López", "P001", 3000.0));
        nomina.add(new EmpleadoTemporal("Juan Pérez", "T005", 160, 15.5));
        nomina.add(new EmpleadoPlanta("Carlos Ruiz", "P002", 4500.0));
        nomina.add(new EmpleadoTemporal("María Soto", "T010", 120, 18.0));

        System.out.println("--- Cálculo de Sueldos (Polimorfismo) ---");

        // Tarea: Invocar calcularSueldo() polimórficamente
        for (Empleado empleado : nomina) {
            double sueldo = empleado.calcularSueldo();

            // Muestra información base
            empleado.mostrarInfoBase();

            // Muestra el sueldo calculado
            System.out.printf("  - Sueldo Mensual: $%.2f\n", sueldo);
        }

        System.out.println("\n--- Clasificación de Empleados (instanceof) ---");

        // Tarea: Usar instanceof para clasificar
        for (Empleado empleado : nomina) {
            String tipo;

            if (empleado instanceof EmpleadoPlanta) {
                tipo = "DE PLANTA (Permanente)";
            } else if (empleado instanceof EmpleadoTemporal) {
                tipo = "TEMPORAL (Por contrato)";
            } else {
                tipo = "DESCONOCIDO";
            }

            // Muestra la clasificación
            System.out.printf("[%s] -> %s\n", empleado.id, tipo);
        }
    }
}
