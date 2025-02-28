/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_clases_objetos;

public class EVA1_1_CLASES_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREAR UN OBJETO
        //INSTANCIAR
        //Identificador para guardar la dirección en memoria 
        //Variable de un tipo de dato abstracto
        Persona perso1;//declaramos una variable de tipo persona
        //Asignanis memoria
        perso1 = new Persona();//creamos un objeto de tipo persona
        perso1.edad = 10;
        perso1.genero = "masculino";
        perso1.nombre = "Ramón Ayala";
        perso1.imprimirDatos();
        System.out.println(perso1);
        //JAVA
        //No accedemos a direcciones reales de memoria (RAM)
        //A las direcciones de memoria (falsas) se les llama
        //REFERENCIAS.
        //APUNTADOR -- VARIABLE QUE ALMACENA UNA DIRECCION (REAL)
    }
    
}

class Persona{
    //DATOS  - ESTADO - ATRIBUTOS
    String nombre;
    int edad;
    String genero;
    //COMPORTAMIENTO
    void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }
}