/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_libro;

import Sitioweb.SitioWeb;

/**
 *
 * @author jealt
 */
public class EVA1_6_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        SitioWeb sitio = new SitioWeb();
        
        
        System.out.println("Bibliografia: ");
        lib.setAutor("Jaime Sabines");
        lib.setTitulo("Los amorosos");
        lib.setAño(1949);
        lib.setCiudad("Tuxtla");
        lib.setEditorial("Booket");
        lib.imprimirReferencias();
        
        System.out.println("Bibliografia: ");
        sitio.setAutor("Eliana González");
        sitio.setNombrepag("IGN Latam");
        sitio.setNombreweb("latam.ign.com");
        sitio.setAño(2025);
        sitio.setMes("Septiembre");
        sitio.setDia(22);
        sitio.setUrl("http.//www.ign.latam.com");
        sitio.imprimirBibliografia();
    }
    
}
