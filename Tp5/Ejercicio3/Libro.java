/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio3;

/**
 *
 * @author david
 */
public class Libro {
    private String titulo;
    private String isbn;

    // Relación Unidireccional (Libro -> Autor)
    private Autor autor; 
    
    // Relación de Agregación (Libro -> Editorial)
    private Editorial editorial; 

    /**
     * Constructor que inicializa el Libro con sus atributos, su Autor y su Editorial.
     */
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        // Asociación Unidireccional
        this.autor = autor; 
        // Agregación
        this.editorial = editorial; 
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    /**
     * Setter para la Asociación Unidireccional. No se requiere setter en Autor.
     */
    public void setAutor(Autor autor) { this.autor = autor; }

    /**
     * Setter para la Agregación.
     */
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }
    
    @Override
    public String toString() {
        // Validación segura y uso de getters
        String nombreAutor = (autor != null) ? autor.getNombre() : "Autor Desconocido";
        String nombreEditorial = (editorial != null) ? editorial.getNombre() : "Editorial Desconocida";

        return "Libro [titulo=" + titulo + ", isbn=" + isbn + 
               ", autor=" + nombreAutor + ", editorial=" + nombreEditorial + "]";
    }
}
