
package tareamod1;

/**
 *
 * @author user
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    
    //Declaración e inicialización de 2 variables enteras
         int numero1 = 5;
         int numero2 = 8; 
         double suma, resta, multiplicacion = 0;
         double division = 0, mod = 0; 
    
         suma = numero1 + numero2;
         resta = numero1 - numero2;
         multiplicacion = numero1 * numero2;
         
    //Controlamos que la división se haga sobre un denominador 0
         if (numero2 != 0){
                division = numero1 / numero2;
                mod = numero1%numero2;
         }
        
    // Imprimimos en consola los resultados
 System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multiplicacion);
 System.out.println("La division es: " + division);
 System.out.println("El mod es: " + mod);
        
  }
}
