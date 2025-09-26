/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio10;

/**
 *
 * @author david
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion; // Usamos String para simplicidad (ej: "2025-09-25")

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }

    // Setters
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setUltimaModificacion(String ultimaModificacion) { this.ultimaModificacion = ultimaModificacion; }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}
