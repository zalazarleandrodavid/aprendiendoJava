/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @author david
 */
public class Granja {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.idGallina = 1;
        gallina1.envejecer(5);
        gallina1.ponerHuevo(12);
        
        gallina1.mostrarEstado();
        
        gallina2.idGallina = 2;
        gallina2.envejecer(7);
        gallina2.ponerHuevo(24);
        
        gallina2.mostrarEstado();
        
    }
}
