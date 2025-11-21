/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP8;

/**
 *
 * @author david
 */
import java.util.ArrayList;
import java.util.List;

// 3. Clase Pedido
class Pedido implements Pagable {
    private List<Producto> productos;
    private Notificable cliente; // 5. Referencia al cliente para notificar
    private String estado;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    // 5. Método para cambiar el estado y notificar
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        String mensaje = "Su pedido ha cambiado de estado a: " + nuevoEstado;
        if (cliente != null) {
            cliente.notificar(mensaje);
        }
    }

    @Override
    public double calcularTotal() {
        // Suma los precios de todos los productos en la lista.
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}