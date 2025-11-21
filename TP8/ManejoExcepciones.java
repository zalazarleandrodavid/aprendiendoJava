/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
// Archivo: ManejoExcepciones.java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

    // 1. División segura (Maneja ArithmeticException e InputMismatchException)
    public static void divisionSegura() {
        System.out.println("--- 1. Prueba División Segura ---");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el numerador: ");
            double num = scanner.nextDouble();
            System.out.print("Ingrese el divisor: ");
            double den = scanner.nextDouble();

            if (den == 0) {
                throw new ArithmeticException("El divisor no puede ser cero.");
            }

            double resultado = num / den;
            System.out.println(" Resultado de la división: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println(" Error de división: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(" Error de entrada: Asegúrese de ingresar números válidos.");
            // Limpiar el buffer para evitar errores si se intenta leer de nuevo en el mismo Scanner
            scanner.nextLine(); 
        } finally {
            // No cerramos el Scanner aquí si queremos seguir usándolo en main.
            // Para propósitos del ejercicio, es mejor pasarlo como parámetro si fuera reutilizado.
            // Para simplicidad, lo mantendremos en este método, asumiendo que se llamará una vez.
        }
    }

    // 2. Conversión de cadena a número (Maneja NumberFormatException)
    public static void convertirCadenaANumero(String texto) {
        System.out.println("\n--- 2. Prueba Conversión a Número ---");
        try {
            int numero = Integer.parseInt(texto);
            System.out.println(" Conversión exitosa. Número entero: " + numero);
        } catch (NumberFormatException e) {
            System.err.println(" Error de formato de número: La cadena '" + texto + "' no es un entero válido.");
        }
    }

    // 3. Lectura de archivo (Maneja FileNotFoundException)
    public static void leerArchivo(String nombreArchivo) {
        System.out.println("\n--- 3. Prueba Lectura de Archivo (Scanner) ---");
        try {
            File archivo = new File(nombreArchivo);
            Scanner fileScanner = new Scanner(archivo);
            System.out.println("Contenido de '" + nombreArchivo + "':");

            while (fileScanner.hasNextLine()) {
                System.out.println("> " + fileScanner.nextLine());
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.err.println(" Error de archivo: El archivo '" + nombreArchivo + "' no fue encontrado.");
        }
    }

    // 4. Excepción personalizada (Lanza y captura EdadInvalidaException)
    public static void verificarEdad(int edad) {
        System.out.println("\n--- 4. Prueba Excepción Personalizada ---");
        try {
            if (edad < 0 || edad > 120) {
                String mensaje = "La edad " + edad + " es inválida. Debe estar entre 0 y 120.";
                throw new EdadInvalidaException(mensaje);
            }
            System.out.println(" Edad válida: " + edad + " años.");

        } catch (EdadInvalidaException e) {
            System.err.println(" Error de validación: " + e.getMessage());
        }
    }
    
    // 5. Uso de try-with-resources (Maneja IOException)
    public static void leerArchivoConRecursos(String nombreArchivo) {
        System.out.println("\n--- 5. Prueba try-with-resources ---");
        // try-with-resources asegura el cierre automático de BufferedReader y FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido de '" + nombreArchivo + "' (BufferedReader):");
            while ((linea = br.readLine()) != null) {
                System.out.println("> " + linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println(" Error de Lectura (TWR): El archivo '" + nombreArchivo + "' no existe.");
        } catch (IOException e) {
            System.err.println(" Error de Entrada/Salida (TWR): Ocurrió un error al leer el archivo.");
        }
    }


    
}