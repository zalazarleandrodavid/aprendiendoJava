/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class AppBiblioteca {
    public static void main(String[] args) {

        // --- Tarea 1: Creamos una biblioteca ---
        System.out.println("--- Tarea 1: Creando Biblioteca ---");
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("¡Biblioteca '" + miBiblioteca.getNombre() + "' creada!\n"); 

        // --- Tarea 2: Crear al menos tres autores ---
        System.out.println("--- Tarea 2: Creando Autores ---");
        Autor autor1 = new Autor("A01", "José Hernández", "Argetino");
        Autor autor2 = new Autor("A02", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A03", "Stephen King", "Estadounidense");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
       

        // --- Tarea 3: Agregar 5 libros a la biblioteca ---
        System.out.println("--- Tarea 3: Agregando Libros ---");
        miBiblioteca.agregarLibro("978-0307389732", "La vuelta de Martin Fierro", 1879, autor1);
        miBiblioteca.agregarLibro("978-0747532699", "Harry Potter y la piedra filosofal", 1997, autor2);
        miBiblioteca.agregarLibro("978-0307743657", "It (Eso)", 1986, autor3);
        miBiblioteca.agregarLibro("978-0307474728", "Martín Fierro", 1872, autor1); 
        miBiblioteca.agregarLibro("978-0439064873", "Harry Potter y la cámara secreta", 1998, autor2); 
     

        // --- Tarea 4: Listar todos los libros ---
        System.out.println("--- Tarea 4: Listado Completo ---");
        miBiblioteca.listarLibros();
       

        // --- Tarea 5: Buscar un libro por ISBN ---
        System.out.println("--- Tarea 5: Buscar ISBN ---");
        Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("978-0307743657");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // --- Tarea 6: Filtrar por año (1998) ---
        System.out.println("--- Tarea 6: Filtrar por Año ---");
        miBiblioteca.filtrarLibrosPorAnio(1998);
       

        // --- Tarea 7: Eliminar un libro y listar ---
        System.out.println("--- Tarea 7: Eliminar ISBN ---");
        miBiblioteca.eliminarLibro("978-0307389732");
        System.out.println("\nLista de libros restantes:");
        miBiblioteca.listarLibros();

        // --- Tarea 8: Mostrar la cantidad total de libros ---
        System.out.println("--- Tarea 8: Cantidad Total ---");
        System.out.println("Total de libros ahora: " + miBiblioteca.obtenerCantidadLibros());
        

        // --- Tarea 9: Listar autores disponibles ---
        System.out.println("--- Tarea 9: Autores Disponibles ---");
        miBiblioteca.mostrarAutoresDisponibles();
        
    }
}
