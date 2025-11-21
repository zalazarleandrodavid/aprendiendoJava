/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
public class ECommerceApp {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana Torres");
        Pedido pedido = new Pedido(cliente);
        
        // Agregar productos
        pedido.agregarProducto(new Producto("Notebook", 1200.00));
        pedido.agregarProducto(new Producto("Mouse", 25.00));

        double subtotal = pedido.calcularTotal();
        System.out.println("\nSubtotal del pedido: $" + subtotal);

        // Pago con Tarjeta de Crédito (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDscto = tarjeta.aplicarDescuento(subtotal);
        System.out.println("Total con descuento (Tarjeta): $" + totalConDscto);
        tarjeta.procesarPago(totalConDscto);
        
        // Notificar cambio de estado
        pedido.cambiarEstado("PAGADO");
        pedido.cambiarEstado("ENVIADO");
    }
}