/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_constructores;

/**
 *
 * @author jealt
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int precio;
    //CONSTRUCTORES - METODOS
    //METODOS: NO TIENEN VALOR DE RETORNO
    //MODIFICADOR DE ACCESO NOMBRE DE LA CLASE(LISTA DE PARAMETROS)
    //CONSTRUCTOR DEFAULT: CONSTRUCTOR SIN PARÁMETROS
    public Vehiculo(){
        System.out.println("CREANDO OBJETO VEHICULO");
        //incializar atributos
        marca = "SIN MARCA";
        modelo = "SIN MODELO";
        año = 0;
        color = "SIN COLOR";
        precio = 0;
    }
    
    public Vehiculo(String mar, String mod, int a, String col, int pre){
         marca = mar;
        modelo = mod;
        año = a;
        color = col;
        precio = pre;
    }
    
     public String getMarca(){
        return marca;
    }
    
    public void setMarca(String valor){
        marca = valor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String valor){
        modelo = valor;
    }
    
    public int getPrecio(){
        return precio;
    }
    
    public void setPrecio(int valor){
        precio = valor;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setAño(int valor){
        año = valor;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String valor){
        color = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo: ");
        //System.out.println("Marca: " + getMarca);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }
    
}
