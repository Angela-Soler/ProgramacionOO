/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4;

import Clases.Futbolista;

/**
 *
 * @author admin
 */
public class Modulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Practica Encapsulamiento");
        
        //Instanciamos la clase Futbolista
        Futbolista futbolista = new Futbolista();
        
        //establecemos los valores
        futbolista.establecerEdad(18);
        futbolista.establecerNombre("Manuel Castro");
        futbolista.establecerEquipo("Real España");
        
        //obtenemos los valores
        System.out.println(futbolista.obtenerEdad());
        System.out.println(futbolista.obtenerNombre());
        System.out.println(futbolista.obtenerEquipo());
        
    }
}
