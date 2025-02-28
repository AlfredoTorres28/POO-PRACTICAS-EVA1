/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_sobrecarga_de_metodos;

/**
 *
 * @author jealt
 */
public class EVA1_13_SOBRECARGA_DE_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo!!");
        System.out.println(100);
        System.out.println(3 > 5);
        System.out.println('c');
        System.out.println(new EVA1_13_SOBRECARGA_DE_METODOS());
        System.out.println(sumar(5, 8));
        System.out.println(sumar("hola", "mundo"));
        sumar();
    }
    //---------HEADER   (CABECERA-------------/
    //                |------FIRMA              -----|
    public static int sumar(int val1, int val2){//sumar(int, int)
        //IMPLEMENTACIÓN
        return val1 + val2;
    }
    
     public static String sumar(String val1, String val2){//sumar(String, String)
        return val1 + val2;    
     }
     
     public static void sumar(){
         System.out.println("ESTE METODO NO HACE NADA");
     }
}
