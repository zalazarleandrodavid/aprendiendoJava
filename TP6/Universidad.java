/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public Profesor buscarProfesorPorId(String id) {

        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;

            }

        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void agregarProfesor(Profesor p) {

        this.profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " agregado a la universidad.");

    }

    public void agregarCurso(Curso c) {

        this.cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " agregado a la universidad.");

    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {

        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {

            curso.setProfesor(profesor);
            System.out.println("Asignación exitosa: " + profesor.getNombre() + " -> " + curso.getNombre());

        } else {

            System.out.println("Error: No se pudo encontrar el curso o el profesor.");
        }

    }

    public void listarProfesores() {
        System.out.println("\n=== Listado de Profesores en " + this.nombre + " ===");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos(); // Mostramos sus cursos
            System.out.println();
        }
    }

    public void listarCursos() {
        System.out.println("\n=== Listado de Cursos en " + this.nombre + " ===");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {

        Curso curso = buscarCursoPorCodigo(codigo);

        if (curso != null) {

            curso.setProfesor(null);
            this.cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado.");

        } else {

            System.out.println("Error: No se encontró el curso a eliminar.");

        }

    }

    public void eliminarProfesor(String id) {

        Profesor profesor = buscarProfesorPorId(id);

        if (profesor != null) {

            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());

            for (Curso c : cursosDelProfesor) {

                c.setProfesor(null);

            }

            this.profesores.remove(profesor);

            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        } else {

            System.out.println("Error: No se encontró el profesor a eliminar.");

        }

    }

    public List< Profesor> getProfesores() {

        return profesores;

    }
}
