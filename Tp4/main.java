/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp4;

/**
 *
 * @author david
 */
public class main {
    public static void main(String[] args) {


        // Instanciar el primer objeto usando el constructor con 3 parámetros
        Empleado asalariado1 = new Empleado("Juan Gabriel ", "Compositor", 50000.0);
        
        // Instanciar el segundo objeto usando el constructor con 2 parámetros (salario por defecto)
        Empleado asalariado2 = new Empleado("Juan Cruz ", "Ingeniero de Sonido");
        
        // Instanciar el tercer objeto para demostrar IDs únicos
        Empleado asalariado3 = new Empleado("Luis Miguel ", "Vocalista", 35000.0);
        
        System.out.println("Información de los empleados creados:");
        System.out.println(asalariado1);
        System.out.println(asalariado2);
        System.out.println(asalariado3);
        System.out.println("------------------------------------");
        
        System.out.println("Actualizando salario de " + asalariado1.getNombre() + " en un 15%...");
        asalariado1.actualizarSalario(15.0);
        System.out.println(asalariado1);
        System.out.println("------------------------------------");

        // Actualizar el salario del asalariado2 con un monto fijo
        System.out.println("Actualizando salario de " + asalariado2.getNombre() + " en $5000...");
        asalariado2.actualizarSalario(5000);
        System.out.println(asalariado2);
        System.out.println("------------------------------------");

        // Mostrar el total de empleados creados después de las instancias
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        
    }
}
