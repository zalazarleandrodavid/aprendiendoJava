/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class AppTienda {

    public static void main(String[] args) {
        Inventario miInventario = new Inventario();

        // --- Tarea 1: Crear y agregar productos ---
        //System.out.println("--- Tarea 1: Agregando Productos ---");
        Producto p1 = new Producto("A001", "PC Gamer", 5500, 10, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("A002", "Teclado Mecánico", 1200, 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("B001", "Jeans Azules", 800, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("C001", "Manzanas (Kg)", 90, 150, CategoriaProducto.ALIMENTOS);
        Producto p5 = new Producto("D001", "Sofá de 3 cuerpos", 2800, 5, CategoriaProducto.HOGAR);

        miInventario.agregarProducto(p1);
        miInventario.agregarProducto(p2);
        miInventario.agregarProducto(p3);
        miInventario.agregarProducto(p4);
        miInventario.agregarProducto(p5);
        
        System.out.println("--- Tarea 2: Listado de Productos ---");
        
        miInventario.listarProductos();
        
        
        System.out.println("--- Tarea 3: Buscar Producto ---");
        Producto productoBuscado = miInventario.buscarProductoPorId("B001");
        
        if (productoBuscado !=null){
        
            productoBuscado.mostrarInfo();
            
        } else {
            System.out.println("Producto no encontrado.");
        } 
        
        System.out.println("--- Tarea 4: Filtrar por Categoría ROPA ---");
        miInventario.filtrarPorCategoria(CategoriaProducto.ROPA);

        
        System.out.println("--- Tarea 5: Eliminar Producto ---");
        miInventario.eliminarProducto("A001");
        System.out.println("\nLista después de eliminar:");
        miInventario.listarProductos();
        
        
        System.out.println("--- Tarea 6: Actualizar Stock ---");
        miInventario.actualizarStock("A002", 40);
        
        if (productoBuscado != null) {
        
            productoBuscado.mostrarInfo();
        
        }
        
        System.out.println("--- Tarea 7: Total Stock Disponible ---");
        int total = miInventario.obtenerTotalStock();
        
        System.out.println("El stock total de todos los productos es: " + total + " unidades.");
      
        System.out.println("--- Tarea 8: Producto con Mayor Stock ---");
        Producto mayorStock = miInventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            mayorStock.mostrarInfo();
        }
        
        System.out.println("--- Tarea 9: Filtrar por Precio ---");
        miInventario.filtrarProductosPorPrecio(1000, 2000);
        
        System.out.println("--- Tarea 10: Categorías Disponibles ---");
        miInventario.mostrarCategoriasDisponibles();
    }
}
