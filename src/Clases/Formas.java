/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public abstract class Formas {
    
    //variables necesarias
    private String color;
    
    
    public Formas(){
        //constructor sin parametros
    }
    
    //metodos establecer para las variables
    public void establecerColor(String _color){
        this.color = _color;
    }
    
    //metodos obtener de la variables
    public String obtenerColor(){
        return color;
    }
    
    //metodo abstracto
     abstract String Dibujar();
    
    
}
