/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sitioweb;

/**
 *
 * @author jealt
 */
public class SitioWeb {
    
    private String autor;
    private String nombrepag;
    private String nombreweb;
    private int año;
    private String mes;
    private int dia;
    private String url;
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String valor){
        autor = valor;
    }
    
    public String getNombrepag(){
        return nombrepag;
    }
    
    public void setNombrepag(String valor){
        nombrepag = valor;
    }
    
    public String getNombreweb(){
        return nombreweb;
    }
    
    public void setNombreweb(String valor){
        nombreweb = valor;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setAño(int valor){
        año = valor;
    }
    
    public String getMes(){
        return mes;
    }
    
    public void setMes(String valor){
        mes = valor;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int valor){
        dia = valor;
    }
    
    public String getUrl(){
        return url;
    }
    
    public void setUrl(String valor){
        url = valor;
    }
    
    public void imprimirBibliografia(){
        System.out.println("Bibliografia: " + autor + "." + "(" + dia + " de " + mes + " del " + año + ")" + "." + nombrepag + ".Obtenido de: " + nombreweb);
        
    }
}
