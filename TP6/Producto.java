/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;


 /**
         *
         * @author david
         */
         
    public class Producto {

        private final String id;
        private final String nombre;
        private final double precio;
        private int cantidad;
        private final CategoriaProducto categoria;
        
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.cantidad = cantidad;
        
    }  
    public void mostrarInfo() {
        System.out.println("--- Información del Producto ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.cantidad + " unidades");
        System.out.println("Categoría: " + this.categoria + " (" + this.categoria.getDescripcion() + ")");
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void setCantidad(int nuevacantidad){
        this.cantidad = nuevacantidad;
    }
    
    }

