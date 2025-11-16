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
 * Subclase para Empleados Temporales.
 */
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTemporal(String nombre, String id, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    /**
     * Implementación específica: Horas trabajadas * Tarifa por hora.
     */
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
}