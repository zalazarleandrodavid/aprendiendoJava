/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP6;

/**
 *
 * @author david
 */
public class AppUniversidad {
    public static void main(String[] args) {

        // --- Tarea 1: Crear 3 profesores y 5 cursos ---
        Profesor p1 = new Profesor("P001", "Ana Torres", "Matemáticas");
        Profesor p2 = new Profesor("P002", "Carlos Ruiz", "Historia");
        Profesor p3 = new Profesor("P003", "Laura Gómez", "Informática");

        Curso c1 = new Curso("C101", "Cálculo I");
        Curso c2 = new Curso("C102", "Álgebra Lineal");
        Curso c3 = new Curso("H201", "Historia Antigua");
        Curso c4 = new Curso("I301", "Programación Java");
        Curso c5 = new Curso("I302", "Bases de Datos");

        // --- Tarea 2: Agregar a la universidad ---
        System.out.println("--- Tarea 2: Agregando todo a la Universidad ---");
        Universidad miUni = new Universidad("Universidad TUP");
        miUni.agregarProfesor(p1);
        miUni.agregarProfesor(p2);
        miUni.agregarProfesor(p3);
        System.out.println();
        miUni.agregarCurso(c1);
        miUni.agregarCurso(c2);
        miUni.agregarCurso(c3);
        miUni.agregarCurso(c4);
        miUni.agregarCurso(c5);
        System.out.println("----------------------------------------------\n");

        // --- Tarea 3: Asignar profesores a cursos ---
        System.out.println("--- Tarea 3: Asignando Profesores ---");
        miUni.asignarProfesorACurso("C101", "P001"); // Cálculo -> Ana
        miUni.asignarProfesorACurso("C102", "P001"); // Álgebra -> Ana
        miUni.asignarProfesorACurso("H201", "P002"); // Historia -> Carlos
        miUni.asignarProfesorACurso("I301", "P003"); // Java -> Laura
        miUni.asignarProfesorACurso("I302", "P003"); // BBDD -> Laura
        System.out.println("----------------------------------------------\n");

        // --- Tarea 4: Listar ---
        System.out.println("--- Tarea 4: Listado General ---");
        miUni.listarCursos();
        miUni.listarProfesores();
        System.out.println("----------------------------------------------\n");

        // --- Tarea 5: Cambiar profesor de un curso ---
        System.out.println("--- Tarea 5: Cambiando Profesor de 'Bases de Datos' ---");
        System.out.println("Laura (P003) será reemplazada por Ana (P001)...");
        miUni.asignarProfesorACurso("I302", "P001"); // BBDD -> Ana
        
        System.out.println("\n--- Verificando Sincronización ---");
        System.out.println("Cursos de Ana Torres (P001):");
        p1.listarCursos(); // Debería tener Cálculo, Álgebra y BBDD
        System.out.println("\nCursos de Laura Gómez (P003):");
        p3.listarCursos(); // Debería tener solo Java
        System.out.println("----------------------------------------------\n");

        // --- Tarea 6: Remover un curso ---
        System.out.println("--- Tarea 6: Eliminando Curso 'Álgebra Lineal' ---");
        miUni.eliminarCurso("C102");
        
        System.out.println("\n--- Verificando Sincronización ---");
        System.out.println("Cursos de Ana Torres (P001) después de eliminar:");
        p1.listarCursos(); // Debería tener solo Cálculo y BBDD
        System.out.println("\nLista de cursos de la universidad:");
        miUni.listarCursos(); // No debería aparecer Álgebra
        System.out.println("----------------------------------------------\n");

        // --- Tarea 7: Remover un profesor ---
        System.out.println("--- Tarea 7: Eliminando Profesor 'Carlos Ruiz' ---");
        miUni.eliminarProfesor("P002"); // Carlos dictaba Historia Antigua
        
        System.out.println("\n--- Verificando Sincronización ---");
        System.out.println("Buscando curso 'Historia Antigua' (H201):");
        Curso cursoHistoria = miUni.buscarCursoPorCodigo("H201");
        if (cursoHistoria != null) {
            cursoHistoria.mostrarInfo(); // Debería decir "Profesor: (Sin asignar)"
        }
        System.out.println("\nLista de profesores de la universidad:");
        miUni.listarProfesores(); // No debería aparecer Carlos
        System.out.println("----------------------------------------------\n");
        
        // --- Tarea 8: Reporte de cursos por profesor ---
        System.out.println("--- Tarea 8: Reporte Cursos por Profesor ---");
        for (Profesor p : miUni.getProfesores()) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
        System.out.println("----------------------------------------------\n");
    }
}
