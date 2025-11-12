/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor p) {

        if (this.profesor == p) {
            return;

        }

        Profesor profesorViejo = this.profesor;
        if (profesorViejo != null) {

            profesorViejo.eliminarCurso(this);
        }

        this.profesor = p;

        if (p != null) {
            p.agregarCurso(this);

        }
    }

    public void mostrarInfo() {
        System.out.println("--- Curso: " + this.nombre + " ---");
        System.out.println("Código: " + this.codigo);

        if (this.profesor != null) {

            System.out.println("Profesor: " + this.profesor.getNombre());

        } else {
            System.out.println("Profesor: (Sin asignar)");

        }

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
