/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio13;

/**
 *
 * @author david
 */
public class GeneradorQR {
    private String version = "1.0"; // Atributo propio del Generador

    // Constructor
    public GeneradorQR() {
        // Inicialización simple
    }

    // Getter y Setter
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    
    /**
     * DEPENDENCIA DE CREACIÓN: Crea una instancia de CodigoQR dentro del método,
     * pero no la almacena como atributo de GeneradorQR.
     * * @return El objeto CodigoQR recién creado.
     */
    public CodigoQR generar(String valor, Usuario usuario) {
        // CREACIÓN DE INSTANCIA: GeneradorQR tiene la responsabilidad de instanciar CodigoQR.
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        
        System.out.println("✅ GeneradorQR (" + this.version + "): Creando nuevo QR...");
        System.out.println("   Valor de datos: " + valor);
        System.out.println("   Asociado a: " + usuario.getNombre());
        
        // Retornamos el objeto para que el Main pueda usarlo o guardarlo.
        return nuevoCodigo;
    }
    
    @Override
    public String toString() {
        return "GeneradorQR [versión=" + version + "]";
    }
}
