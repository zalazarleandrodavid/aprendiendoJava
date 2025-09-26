/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio12;

/**
 *
 * @author david
 */
public class Calculadora {
    private String tipo = "Financiera";

    // Constructor (simple)
    public Calculadora() {
        // Inicialización simple
    }

    // Getter y Setter
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    /**
     * DEPENDENCIA DE USO: La clase Calculadora utiliza la clase Impuesto
     * como parámetro, pero no guarda una referencia a ella.
     */
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double montoBase = impuesto.getMonto();
            // Simulación de un cálculo complejo (ej: 21% IVA)
            double montoFinal = montoBase * 1.21; 
            
            System.out.println("🧮 Calculadora (" + this.tipo + "): Calculando impuesto...");
            System.out.println("   Monto Base: $" + montoBase);
            System.out.println("   Monto Final (+21%): $" + montoFinal);
            System.out.println("   Para: " + impuesto.getContribuyente().getNombre());
        } else {
            System.out.println("🛑 Calculadora: No se puede calcular un impuesto nulo.");
        }
    }
    
    @Override
    public String toString() {
        return "Calculadora [tipo=" + tipo + "]";
    }
}
