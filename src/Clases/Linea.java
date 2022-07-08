/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public class Linea extends Formas{

    @Override
    public String Dibujar() {
        return("Es una línea");
    }
    
     public String establecerColor() {
        return("Rojo");
    }
    
    //variable
    private double largo;
    
    //Establecer
    public void establecerLongitud(double _largo){
        this.largo = _largo;
    }
    
    //metodos obtener de la variables
    public double obtenerLongitud(){
        return largo;
    }
}
