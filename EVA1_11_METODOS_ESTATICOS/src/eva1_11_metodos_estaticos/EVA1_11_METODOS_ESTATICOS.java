/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_metodos_estaticos;

/**
 *
 * @author jealt
 */
public class EVA1_11_METODOS_ESTATICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorAleatorio = Math.random();
        int valor = (int)(valorAleatorio * 1000);
        System.out.println(valorAleatorio);
        System.out.println(valor);
        //
        Persona perso = new Persona();
        perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERATURAS
        Temperatura temp = new Temperatura();
        
        System.out.println(Temperatura.convertirCaF(100));
        System.out.println(Temperatura.convertirCaK(100));
        System.out.println(Temperatura.convertirFaC(100));
        System.out.println(Temperatura.convertirFaK(100));
        System.out.println(Temperatura.convertirKaC(100));
    }
    
}

class Persona{
    int valor;
    public void mostrarMensaje(){
        System.out.println("Hola mundo!!");
    }
}
