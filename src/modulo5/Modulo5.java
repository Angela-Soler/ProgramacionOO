/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5;

import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Linea;
import Clases.Triangulo;

/**
 *
 * @author admin
 */
public class Modulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Practica Módulo 5");
        
        //Instanciamos las clases
        Circulo C = new Circulo();
        Linea L = new Linea();
        Triangulo T = new Triangulo();
        Cuadrado CC = new Cuadrado();
        
        //Llamamos los metodos
        //circulo
        System.out.println(C.Dibujar());
        System.out.println(C.establecerColor());
        C.establecerRadio(15);
        System.out.println("El radio es: "+C.obtenerRadio());
        
        //linea
        System.out.println(L.Dibujar());
        System.out.println(L.establecerColor());
        L.establecerLongitud(10);
        System.out.println("Longitud de la linea: "+L.obtenerLongitud());
        
        //Triangulo
        System.out.println(T.Dibujar());
        System.out.println(T.establecerColor());
        T.establecerAngulo(4);
        System.out.println("El angulo es: "+T.obtenerLAngulo());
        
        //Cuadrado
        System.out.println(CC.Dibujar());
        System.out.println(CC.establecerColor());
        CC.establecerArea(8);
        System.out.println("El area es: "+CC.obtenerArea());
    }
}
