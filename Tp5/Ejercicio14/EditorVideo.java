/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio14;

/**
 *
 * @author david
 */
public class EditorVideo {
    private String nombreSoftware = "FinalCut Pro"; // Atributo propio del Editor

    // Constructor
    public EditorVideo() {
        // Inicialización simple
    }

    // Getter y Setter
    public String getNombreSoftware() { return nombreSoftware; }
    public void setNombreSoftware(String nombreSoftware) { this.nombreSoftware = nombreSoftware; }
    
    /**
     * DEPENDENCIA DE CREACIÓN: Crea una instancia de Render dentro del método,
     * pero no la almacena como atributo de EditorVideo.
     * @return El objeto Render recién creado.
     */
    public Render exportar(String formato, Proyecto proyecto) {
        // CREACIÓN DE INSTANCIA: EditorVideo tiene la responsabilidad de instanciar Render.
        Render nuevoRender = new Render(formato, proyecto);
        
        System.out.println("🎬 Editor (" + this.nombreSoftware + "): Iniciando proceso de exportación...");
        System.out.println("   Exportando Proyecto: " + proyecto.getNombre());
        System.out.println("   Formato: " + formato);
        
        // Simulación del proceso de renderizado
        System.out.println("   [RENDERIZADO COMPLETO]");
        
        // Retornamos el objeto para que el Main pueda usarlo o guardarlo.
        return nuevoRender;
    }
    
    @Override
    public String toString() {
        return "EditorVideo [software=" + nombreSoftware + "]";
    }
}
