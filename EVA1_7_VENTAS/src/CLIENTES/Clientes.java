/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLIENTES;

/**
 *
 * @author jealt
 */
public class Clientes {
    
    private String nombre;
    private String apellido;
    private String rfc;
    private String persona;
    private int edad;
    private long telefono;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String valor){
        apellido = valor;
    }
    
    public String getRfc(){
        return rfc;
    }
    
    public void setRfc(String valor){
        rfc = valor;
    }
    
    public String getPersona(){
        return persona;
    }
    public void setPersona(String valor){
        persona = valor;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int valor){
        edad = valor;
    }
    
    public long getTelefono(){
        return telefono;
    }
    
    public void setTelefono(long valor){
        telefono = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos del cliente:");
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("RFC: " + rfc);
        System.out.println("Tipo de persona: " + persona);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
    }
}
