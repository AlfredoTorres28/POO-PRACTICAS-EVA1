/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_TELEVISION;

/**
 *
 * @author jealt
 */
public class Tele {
    
     private int volumen;
    private int canal;
    private boolean encendido;
    
    public Tele(){
        System.out.println("CREANDO TELEVISION:");
        volumen = 3;
        canal = 10;
        encendido = 
    }
    
    
    
    public void imprimirDatos(){
        System.out.println("Acciones de la tele");
        System.out.println("");
    }
    
    public void subirVolumen(){
        if(volumen < 100)
            volumen += 1;//acumulador ---> volumen - volumen +
    }
    
    public void bajarVolumen(){
        if(volumen < 0)
            volumen -= 1;
    }
    //CANALES REQUIERE TRES METODOS: SUBIR, BAJAR, ASIGNAR CANAL
    
    public void subirCanal(){
        if(encendido == true)
            if(canal == 10)
                canal = 0;
            canal += 1;
    }
    
    public void bajarCanal(){
        if(encendido == true)
            if(canal == 0)
                canal = 10;
            canal -= 1;
    }
    
    public void setCanal(int valor){
        canal = valor;
    }
}
