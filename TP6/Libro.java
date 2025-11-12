/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int aniopublicacion, Autor autor) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = aniopublicacion;
        this.autor = autor;
    }
// Metodo para mostrar informacion

    public void mostrarInfo() {

        System.out.println("--- Libro: " + this.titulo + " ---");
        System.out.println("  ISBN: " + this.isbn);
        System.out.println("  Año: " + this.anioPublicacion);
        System.out.println("  Autor: " + this.autor.getNombre());
      
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

}
