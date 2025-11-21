/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
// 4. Clase TarjetaCredito (Implementa PagoConDescuento)
class TarjetaCredito implements PagoConDescuento {
    private final double TASA_DESCUENTO = 0.05; // 5% de descuento

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - TASA_DESCUENTO);
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("💳 Procesando pago con Tarjeta de Crédito por: $" + monto);
        // Lógica de conexión a pasarela...
        return true; // Simulación de pago exitoso
    }
}

// 4. Clase PayPal (Implementa Pago)
class PayPal implements Pago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("🅿️ Procesando pago con PayPal por: $" + monto);
        // Lógica de conexión a API de PayPal...
        return true; // Simulación de pago exitoso
    }
}