/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_this;

/**
 *
 * @author jealt
 */
public class Laptop {
    
    private String procesador;
    private String memoria;
    private String discoduro;
    private double pantallata;
    private String marca;
    private String modelo;
    
    public Laptop(){
        this.procesador = "NO TIENE PROCESADOR";
        this.memoria = "NO TIENE MEMORIA";
        this.discoduro = "NO TIENE DISCO DURO";
        this.pantallata = 0;
        this.marca = "SIN MARCA";
        this.modelo = "SIN MODELO";
    }
    
    public Laptop(String procesador, String memoria, String discoduro, double pantallata, String marca, String modelo){
        this.procesador = procesador;
        this.memoria = memoria;
        this.discoduro = discoduro;
        this.pantallata = pantallata;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    
    public String getMemoria(){
        return this.memoria;
    }
    
    public void setMemoria(String memoria){
        this.memoria = memoria;
    }
    
    public String getDiscoduro(){
        return this.discoduro;
    }
    
    public void setDiscoduro(String discoduro){
        this.discoduro = discoduro;
    }
    
    public double getPantallata(){
        return this.pantallata;
    }
    
    public void setPantallata(double pantallata){
        this.pantallata = pantallata;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void ImprimirDatos(){
        System.out.println("CREANDO LAPTOP: ");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria: " + memoria);
        System.out.println("Disco duro: " + discoduro);
        System.out.println("Pantalla: " + pantallata);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
