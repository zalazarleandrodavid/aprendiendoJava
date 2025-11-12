/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class Autor {
    
    private String id;
    private String nombre;
    private String nacionalidad;
    
public Autor(String id, String nombre,String nacionalidad){

    this.id = id;
    this.nombre= nombre;
    this.nacionalidad = nacionalidad;
    
    }

// Metodo para mostrar informacion

public void mostrarInfo(){

    System.out.println("  ID: " + this.id + ", Nombre: " + this.nombre + ", Nacionalidad: " + this.nacionalidad);
}

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }


}

