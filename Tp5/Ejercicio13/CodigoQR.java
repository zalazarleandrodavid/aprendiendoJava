/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio13;

/**
 *
 * @author david
 */
public class CodigoQR {
    private String valor;
    
    // Asociación Unidireccional (CódigoQR -> Usuario)
    private Usuario usuario; 

    /**
     * Constructor usado por GeneradorQR para crear la instancia.
     */
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    
    }

    // Getters
    public String getValor() { return valor; }
    public Usuario getUsuario() { return usuario; }

    // Setters (Si el valor de un QR fuera inmutable, podríamos omitir estos)
    public void setValor(String valor) { this.valor = valor; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    
    @Override
    public String toString() {
        String infoUsuario = (usuario != null) ? usuario.getNombre() : "N/A";
        return "CodigoQR [valor=" + valor + ", creado para=" + infoUsuario + "]";
    }
}
