
package tareamod1;

/**
 *
 * @author user
 */
public class Ejercicio5 {
       public static void main(String[] args) {
      //arrreglo
    String[][] estudiantes = {{"Manuel","Castro","Electronica","Loginsa"},{"Erik","Ulloa","Computacion",""},{"Eliazar","erazo","Produccion",""},{"Judy","Castro","Computacion",""},{"Maria","Rivass","Electronica",""},{"Ramon","Flores","Computacion","Ecommerce"}};
    
     for (int i = 0; i < 5; i = i + 1) {
          for (int j = 0; j < 4; j = j + 1) {
    System.out.println(estudiantes[i][j]);
        }
           System.out.println("\n");
  }
     }
}
