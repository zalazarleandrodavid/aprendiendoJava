/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp4;

/**
 *
 * @author david
 */
public class Empleado {
    private static int id = 0; //Identificador único del empleado. 
    private String nombre;// Nombre completo. 
    private String puesto; //Cargo que desempeña. 
    private double salario; //Salario actual. 
    private static int totalEmpleados; //Contador global de empleados creados. 
    private static int newId;
   
    
    
    
    public Empleado( String nombre, String puesto, double salario){
                this.id = newId++;
                this.nombre = nombre;
                this.puesto = puesto;
                this.salario = salario;
                totalEmpleados++;
    }
                
    public Empleado( String nombre, String puesto){
                this.id = newId++;
                this.nombre = nombre;
                this.puesto = puesto;
                this.salario = 10000;
                totalEmpleados++;
    }
    
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100);
        }
    }
    
    public void actualizarSalario(int monto) {
        if (monto > 0) {
            this.salario += monto;
        }
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: " + this.salario;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



