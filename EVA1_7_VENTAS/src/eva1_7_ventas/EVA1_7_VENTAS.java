/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_ventas;

import CLIENTES.Clientes;

/**
 *
 * @author jealt
 */
public class EVA1_7_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Productos prod = new Productos();
        Clientes cli = new Clientes();
        
        prod.setNombre("Tarjeta grafica");
        prod.setMarca("ZOTAC Gaming");
        prod.setModelo("Geforce RTX 4060");
        prod.setPrecio(7247.47);
        prod.setClave(43201401);
        prod.setInventario(22);
        prod.imprimirInformación();
        
        System.out.println(""
                + ""
                + ""
                + ""
                + "");
        
        cli.setNombre("Eliud");
        cli.setApellido("Gonzalez Muro");
        cli.setRfc("GOME210904EGM");
        cli.setPersona("Persona fisica");
        cli.setEdad(23);
        cli.setTelefono(6148472637L);
        cli.imprimirDatos();
    }
    
}
