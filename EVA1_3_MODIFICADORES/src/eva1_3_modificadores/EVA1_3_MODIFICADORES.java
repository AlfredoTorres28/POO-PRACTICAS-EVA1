/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadores;

/**
 *
 * @author jealt
 */
public class EVA1_3_MODIFICADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR UN OBJETO
        //CLASE IDENTIFICADOR = new CONSTRUCTOR(PARAMETROS);
        Persona perso = new Persona();
        perso.setNombre("Eteel");
        perso.setApellidos("Gonzalez Muro");
        perso.setEdad(9);
        perso.setGenero("Hombre");
        perso.setCurp("EGM373365832C");
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        System.out.println("Genero:" + perso.getGenero());
        System.out.println("Curp: " + perso.getCurp());
    }
    
}
