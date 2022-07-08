/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public class Cuadrado extends Formas{

    @Override
    public String Dibujar() {
        return("Es un cuadrado");
    }
    
      public String establecerColor() {
        return("Anaranjado");
    }
    
    //variable
    private double area;
    
    //Establecer
    public void establecerArea(double _area){
        this.area = _area;
    }
    
    //metodos obtener de la variables
    public double obtenerArea(){
        return area;
    }
}
