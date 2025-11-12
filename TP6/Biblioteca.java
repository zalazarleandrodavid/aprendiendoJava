/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author david
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {

        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);

        this.libros.add(nuevoLibro);

        System.out.println("Libro '" + titulo + "' agregado a la " + this.nombre);

    }

    public void listarLibros() {

        if (this.libros.isEmpty()) {
            System.out.println("La biblioteca '" + this.nombre + "' está vacía.");
        }
        System.out.println("\n--- Catálogo de " + this.nombre + " ---");
        for (Libro libro : this.libros) {
            libro.mostrarInfo(); // Cada libro sabe cómo mostrarse
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {

        for (Libro libro : this.libros) {

            if (libro.getIsbn().equals(isbn)) {

                return libro;
            }

        }
        return null;
    }

    public void eliminarLibro(String isbn) {

        boolean eliminado = this.libros.removeIf(libro -> libro.getIsbn().equals(isbn));

        if (eliminado) {

            System.out.println("Libro con ISBN " + isbn + " ha sido eliminado.");

        } else {

            System.out.println("No se encontró libro con ISBN " + isbn + ".");

        }
    }

    public int obtenerCantidadLibros() {
        return this.libros.size(); // .size() nos da el tamaño de la lista
    }

    public void filtrarLibrosPorAnio(int anio) {

        System.out.println("--- Libros publicados en " + anio + " ---");

        boolean encontrados = false;

        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {

                libro.mostrarInfo();
                encontrados = true;

            }

        }
        if (!encontrados) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {

        if (this.libros.isEmpty()) {

            System.out.println("No hay libros, por lo tanto no hay autores.");
            return;

        }
        Set<Autor> autoresUnicos = new HashSet<>();

        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor());

        }

        System.out.println("--- Autores Disponibles en " + this.nombre + " ---");
        for (Autor autor : autoresUnicos) {
            autor.mostrarInfo();

        }

    }
}
