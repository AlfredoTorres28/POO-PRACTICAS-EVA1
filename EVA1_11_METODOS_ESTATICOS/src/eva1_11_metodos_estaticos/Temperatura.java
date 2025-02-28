/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_11_metodos_estaticos;

/**
 *
 * @author jealt
 */
public class Temperatura {
    
    public static double convertirFaC(double fa){
        double resu;
        resu = (fa - 32) * (5.0/9.0);
        return resu;
    }
    
    public static double convertirCaF(double ce){
       double resu;
       resu = (ce *(9.0/5.0)) + 32;
       return resu;
    }
    
    public static double convertirCaK(double ce){
        double resu;
        resu = (ce + 273.15);
        return resu;
    }
    
    public static double convertirKaC(double kel){
        double resu;
        resu = (kel - 273.15);
        return resu;
    }
    
    public static double convertirFaK(double fa){
        double resu;
        resu = (5.0/9.0) + (fa - 32) - 273;
        return resu;
    }
}
