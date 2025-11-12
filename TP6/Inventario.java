/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {

        this.productos = new ArrayList<>();

    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println(p.getNombre() + " El producto se agrego al Inventario. ");

    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El Inventario esta Vacio ");

        }
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {

        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void actualizarStock(String id, int nuevaCantidad) {

        Producto productoEncontrado = buscarProductoPorId(id);

        if (productoEncontrado != null) {

            productoEncontrado.setCantidad(nuevaCantidad);

            System.out.println("Stock de" + productoEncontrado.getNombre() + " Se actualizo a " + nuevaCantidad);

        } else {
            System.out.println(" No se puede actualizar: El producto con Id " + id + " Porque no se a encontrado. ");

        }

    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("--- Mostrando productos de la categoría: " + categoria + " ---");

        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en esta categoría.");
        }

    }

    public void eliminarProducto(String id) {

        boolean eliminado = this.productos.removeIf(p -> p.getId().equals(id));

        if (eliminado) {
            System.out.println("Producto con ID " + id + " eliminado.");
        } else {
            System.out.println("No se encontró producto con ID " + id + ".");
        }

    }

    // Tarea: Obtener el total de unidades en stock
    public int obtenerTotalStock() {
        int total = 0;
        // Sumamos la cantidad de cada producto
        for (Producto p : this.productos) {
            total = (int) (total + p.getCantidad()); // También vale: total += p.getCantidad();
        }
        return total;
    }

    // Tarea: Obtener el producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null; // No hay productos
        }

        // Suponemos que el primero es el que tiene más stock
        Producto productoMayorStock = this.productos.get(0);

        // Recorremos la lista comparando
        for (Producto p : this.productos) {
            if (p.getCantidad() > productoMayorStock.getCantidad()) {
                productoMayorStock = p;
            }
        }
        return productoMayorStock;
    }

    // Tarea: Filtrar por rango de precio
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("--- Mostrando productos entre $" + min + " y $" + max + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No hay productos en ese rango de precio.");
        }
    }

    // Tarea: Mostrar las categorías (desde el Enum)
    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías Disponibles ---");
        // 'CategoriaProducto.values()' nos da un array con todos los valores del enum
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}
