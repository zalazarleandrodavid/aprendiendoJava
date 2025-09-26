/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase.TP5.Ejercicio9;

/**
 *
 * @author david
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    
    // Asociación Unidireccional (CitaMédica -> Paciente)
    private Paciente paciente; 
    
    // Asociación Unidireccional (CitaMédica -> Profesional)
    private Profesional profesional; 

    /**
     * Constructor que inicializa los atributos y las dos Asociaciones Unidireccionales.
     */
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente; 
        this.profesional = profesional; 
    }

    // Getters
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    // Setters
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setHora(String hora) { this.hora = hora; }
    
    /**
     * Setter para la Asociación con Paciente.
     */
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    /**
     * Setter para la Asociación con Profesional.
     */
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }
    
    @Override
    public String toString() {
        String nombrePaciente = (paciente != null) ? paciente.getNombre() : "Paciente No Definido";
        String nombreProfesional = (profesional != null) ? profesional.getNombre() : "Profesional No Definido";

        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + 
               ", paciente=" + nombrePaciente + 
               ", profesional=" + nombreProfesional + "]";
    }
}
