/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_this;

/**
 *
 * @author jealt
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
        this.nombre = "SIN NOMBRE";
        this.apellido = "SIN APELLIDO";
        this.edad = 0;
    }
    
    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
       
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void ImprimirDatos(){
        System.out.println("Informacion basica: ");
        System.out.println("Nombre completo: " + this.nombre + " " + this.apellido);
        System.out.println("Edad: " + this.edad);
    }
}
