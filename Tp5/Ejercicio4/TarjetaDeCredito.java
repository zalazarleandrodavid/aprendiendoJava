/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio1.Ejercicio4;

/**
 *
 * @author david
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    
    // Agregación (1:1): El Banco al que pertenece
    private Banco banco; 
    
    // Asociación Bidireccional (1:1): El Cliente titular
    private Cliente cliente; 

    /**
     * Constructor que inicializa los atributos y la Agregación (Banco).
     */
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; // Agregación: Se asigna una entidad Banco ya existente
    }

    // Getters
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Banco getBanco() { return banco; }
    public Cliente getCliente() { return cliente; }

    // Setters
    public void setNumero(String numero) { this.numero = numero; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public void setBanco(Banco banco) { this.banco = banco; }
    
    /**
     * Setter para la Asociación Bidireccional con Cliente.
     * Es el punto de control para mantener la coherencia del 1:1.
     */
    public void setCliente(Cliente nuevoCliente) {
        if (this.cliente != nuevoCliente) { 
            // 1. Limpiar el enlace en el Cliente anterior si existe
            if (this.cliente != null) {
                this.cliente.setTarjeta(null); 
            }
            
            // 2. Asociar el nuevo Cliente a la Tarjeta
            this.cliente = nuevoCliente;
            
            // 3. Establecer la bidireccionalidad: Asocia la Tarjeta al nuevo Cliente
            if (nuevoCliente != null && nuevoCliente.getTarjeta() != this) {
                nuevoCliente.setTarjeta(this);
            }
        }
    }
    
    @Override
    public String toString() {
        // Uso de getter para la validación
        String nombreCliente = (cliente != null) ? cliente.getNombre() : "Sin asignar";
        
        return "TarjetaDeCredito [numero=" + numero + ", vencimiento=" + fechaVencimiento + 
               ", banco=" + banco.getNombre() + ", titular=" + nombreCliente + "]";
    }
}
