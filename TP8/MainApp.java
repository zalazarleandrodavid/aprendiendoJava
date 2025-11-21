/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
// Archivo: MainApp.java
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        
        // Se crea un solo Scanner para la entrada de usuario (Ejercicio 1)
        Scanner inputScanner = new Scanner(System.in);
        
        // --- Ejecución de Ejercicios ---
        
        // 1. División Segura (Descomentar la línea de abajo para probar con entrada de teclado)
        // ManejoExcepciones.divisionSegura(inputScanner); 
        
        // 2. Conversión de cadena a número
        ManejoExcepciones.convertirCadenaANumero("42");     // Correcto
        ManejoExcepciones.convertirCadenaANumero("abc");    // Error NumberFormatException

        // 4. Excepción personalizada
        ManejoExcepciones.verificarEdad(30);    // Correcto
        ManejoExcepciones.verificarEdad(-10);   // Error EdadInvalidaException
        
        // 3. Lectura de Archivo (Scanner) - Fallará si no existe
        ManejoExcepciones.leerArchivo("archivo_inexistente_1.txt"); 
        
        // 5. Uso de try-with-resources - Fallará si no existe
        ManejoExcepciones.leerArchivoConRecursos("archivo_inexistente_2.txt"); 
        
        // Cerrar el Scanner al finalizar el programa
        inputScanner.close();
    }
}