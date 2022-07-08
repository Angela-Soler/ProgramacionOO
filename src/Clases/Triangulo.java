/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public class Triangulo extends Formas{

    @Override
    public String Dibujar() {
        return("Es un triangulo");
    }
    
      public String establecerColor() {
        return("Amarillo");
    }
    
    //variable
    private double angulo;
    
    //Establecer
    public void establecerAngulo(double _angulo){
        this.angulo = _angulo;
    }
    
    //metodos obtener de la variables
    public double obtenerLAngulo(){
        return angulo;
    }
}
