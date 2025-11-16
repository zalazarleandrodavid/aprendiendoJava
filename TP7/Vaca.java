/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP7;

/**
 *
 * @author david
 */
/**
 * Subclase Vaca.
 */
public class Vaca extends Animal {

    public Vaca(String nombre) {
        // Llama al constructor de la clase base
        super(nombre, "Vaca"); 
    }

    /**
     * Sobrescribe el método hacerSonido().
     */
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuuu! ¡Muuuu!");
    }
}