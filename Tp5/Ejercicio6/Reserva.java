/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio6;

/**
 *
 * @author david
 */
public class Reserva {
    private String fecha;
    private String hora;
    
    // Asociación Unidireccional (Reserva -> Cliente)
    private Cliente cliente; 
    
    // Agregación (Reserva -> Mesa)
    private Mesa mesa; 

    /**
     * Constructor que inicializa los atributos, el Cliente y la Mesa.
     */
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        // Asociación Unidireccional
        this.cliente = cliente; 
        // Agregación
        this.mesa = mesa; 
    }

    // Getters
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente getCliente() { return cliente; }
    public Mesa getMesa() { return mesa; }

    // Setters
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setHora(String hora) { this.hora = hora; }
    
    /**
     * Setter para la Asociación Unidireccional.
     */
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    /**
     * Setter para la Agregación.
     */
    public void setMesa(Mesa mesa) { this.mesa = mesa; }
    
    @Override
    public String toString() {
        String nombreCliente = (cliente != null) ? cliente.getNombre() : "Sin Cliente";
        String infoMesa = (mesa != null) ? "Mesa #" + mesa.getNumero() : "Mesa No Asignada";

        return "Reserva [fecha=" + fecha + ", hora=" + hora + 
               ", cliente=" + nombreCliente + 
               ", " + infoMesa + "]";
    }
}
