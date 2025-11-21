/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
public interface Pagable {
    double calcularTotal();
}

// 4. Interfaces Pago y PagoConDescuento

interface Pago {
    boolean procesarPago(double monto);
}

interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}

// 5. Interfaz Notificable
interface Notificable {
    void notificar(String mensaje);
}