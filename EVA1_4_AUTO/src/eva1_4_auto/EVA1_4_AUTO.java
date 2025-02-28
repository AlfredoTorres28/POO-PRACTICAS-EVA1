/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_auto;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA1_4_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura = new Scanner(System.in);
        Vehiculo autom = new Vehiculo();
        
        System.out.println("Marca del vehiculo: ");
        String cade = captura.nextLine();
        autom.setMarca("Dodge");
        autom.setModelo("Challenger");
        autom.setPrecio(120000);
        autom.setAño(2010);
        autom.setColor("Negro");
        autom.imprimirDatos();
        System.out.println("Marca: " + autom.getMarca());
        System.out.println("Modelo: " + autom.getModelo());
        System.out.println("Precio: " + autom.getPrecio());
        System.out.println("Año: " + autom.getAño());
        System.out.println("Color: " + autom.getColor());
    }
    
}
