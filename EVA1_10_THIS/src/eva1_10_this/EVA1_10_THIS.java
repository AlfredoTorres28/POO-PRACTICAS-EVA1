/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_this;

/**
 *
 * @author jealt
 */
public class EVA1_10_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop lap = new Laptop();
        Persona pers = new Persona();
        
        lap.setProcesador("Intel i5 13400f");
        lap.setMemoria("Ram DDR4 32GB,3200mhz");
        lap.setDiscoduro("NVMe SSD 512gb M.2");
        lap.setPantallata(15.6);
        lap.setMarca("HP");
        lap.setModelo("Victus");
        lap.ImprimirDatos();
        
        System.out.println(""
                + ""
                + ""
                + ""
                + "");
        
        pers.setNombre("Eteel");
        pers.setApellido("Gonzalez Muro");
        pers.setEdad(9);
        pers.ImprimirDatos();
    }
}
