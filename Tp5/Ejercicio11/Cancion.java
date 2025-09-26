/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio11;

/**
 *
 * @author david
 */
public class Cancion {
    private String titulo;
    
    // Asociación Unidireccional (Canción -> Artista)
    private Artista artista; 

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setArtista(Artista artista) { this.artista = artista; }
    
    @Override
    public String toString() {
        String nombreArtista = (artista != null) ? artista.getNombre() : "Artista Desconocido";
        return "Cancion [titulo=" + titulo + ", artista=" + nombreArtista + "]";
    }
}
