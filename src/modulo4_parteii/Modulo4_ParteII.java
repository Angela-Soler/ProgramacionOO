/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4_parteii;

import Clases.CostaRica;
import Clases.Guatemala;
import Clases.Honduras;

/**
 *
 * @author admin
 */
public class Modulo4_ParteII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Practica Abstracción");
        Honduras H = new Honduras();
        Guatemala G = new Guatemala();
        CostaRica CR = new CostaRica();
        
        //imprimimos los valores
        System.out.println(H.getEquipo());
        System.out.println(H.getCapitan());
        
        System.out.println(G.getEquipo());
        System.out.println(G.getCapitan());
        
        System.out.println(CR.getEquipo());
        System.out.println(CR.getCapitan());
    }
}
