/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio8;

/**
 *
 * @author david
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    
    // Agregación (1:1): El Usuario que realizó la firma.
    private Usuario usuario; 

    /**
     * Constructor usado internamente por Documento para la Composición.
     */
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Agregación: Recibe un Usuario ya existente
    }

    // Getters
    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }

    // Setters
    public void setCodigoHash(String codigoHash) { this.codigoHash = codigoHash; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; } // Setter para la Agregación

    @Override
    public String toString() {
        String nombreUsuario = (usuario != null) ? usuario.getNombre() : "Usuario Desconocido";
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + nombreUsuario + "]";
    }
}
