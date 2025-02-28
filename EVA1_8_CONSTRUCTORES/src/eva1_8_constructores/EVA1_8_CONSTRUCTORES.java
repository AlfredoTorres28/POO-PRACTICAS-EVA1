/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_constructores;

/**
 *
 * @author jealt
 */
public class EVA1_8_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro = new Vehiculo("Dodge", "Challenger", 2010, "Negro", 85000);
        
        carro.imprimirDatos();
        
        Vehiculo carronue = new Vehiculo();
        carronue.imprimirDatos();
        
    }
    
}
