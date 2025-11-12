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
public class Profesor {
    
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;
    
    public Profesor(String id,String nombre,String especialidad){
        
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
        
    } 
    
    public void agregarCurso(Curso c){
    
    if (c !=null && !this.cursos.contains(c)){
    
        this.cursos.add(c);
        
        if(c.getProfesor() != this){
        
        c.setProfesor(this);
        }
    }
    
    }
    
    public void eliminarCurso(Curso c){
    
        if (c != null && this.cursos.contains(c)){
        
        this.cursos.remove(c);
        
        if (c.getProfesor() == this){
        
        c.setProfesor(null);
        }
                
        
        }
    
    }
    
    public void listarCursos(){
    
        if (this.cursos.isEmpty()){
        
            System.out.println("  - No dicta cursos actualmente.");
        
        } else{
        
            System.out.println("  - Cursos que dicta:");
            for (Curso c : this.cursos){
            
                System.out.println("    * " + c.getCodigo() + ": " + c.getNombre());
            }
        
        }
    
    }
    
    public void mostrarInfo() {
        System.out.println("--- Profesor: " + this.nombre + " ---");
        System.out.println("ID: " + this.id);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Cantidad de cursos: " + this.cursos.size());
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    
}
