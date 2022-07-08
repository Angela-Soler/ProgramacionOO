/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public class Circulo extends Formas{    

    @Override
    public String Dibujar() {
       return("Es un circulo");
    }
    
    public String establecerColor() {
        return("Verde");
    }
    
    //variable
    private double radio;
    
    //Establecer
    public void establecerRadio(double _radio){
        this.radio = _radio;
    }
    
    //metodos obtener de la variables
    public double obtenerRadio(){
        return radio;
    }
    
}
