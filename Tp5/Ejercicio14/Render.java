/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio14;

/**
 *
 * @author david
 */
public class Render {
    private String formato;
    
    // Asociación Unidireccional (Render -> Proyecto)
    private Proyecto proyecto; 

    /**
     * Constructor usado por EditorVideo para crear la instancia.
     */
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }

    // Setters
    public void setFormato(String formato) { this.formato = formato; }
    public void setProyecto(Proyecto proyecto) { this.proyecto = proyecto; }
    
    @Override
    public String toString() {
        String infoProyecto = (proyecto != null) ? proyecto.getNombre() : "Proyecto N/A";
        return "Render [formato=" + formato + ", de proyecto=" + infoProyecto + "]";
    }
}
