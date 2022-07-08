/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author admin
 */
public class Futbolista {
    //variables necesarias
    private int edad;
    private String nombre;
    private String equipo;
    
    //metodos establecer para las variables
    public void establecerEdad(int _edad){
        this.edad = _edad;
    }
    
    public void establecerNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public void establecerEquipo(String _equipo){
        this.equipo = _equipo;
    }
    
    //metodos obtener de la variables
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEquipo(){
        return equipo;
    }
}
