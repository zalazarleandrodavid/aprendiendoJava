/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
/**
 * Subclase para Empleados de Planta (permanentes).
 */
public class EmpleadoPlanta extends Empleado {
    private double salarioMensual;
    //private double bonificacionAnual;

    public EmpleadoPlanta(String nombre, String id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
        //this.bonificacionAnual = bonificacionAnual;
    }

    /**
     * Implementación específica: Salario Mensual + Bonificación / 12 meses.
     */
    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }
}