
package tareamod2;

/**
 *
 * @author user
 */
public class Recursos {
     public String mensaje() {
         String msj="Programacion Orientada a Objetos";
         return msj;
    }
    public String edad(int edad) {
        String msj;
        if (edad>=21){
            msj=edad+" Mayor deedad";
        }
        else
        {
            msj=edad+" Menor de edad";
        }
        return msj;
    }
    public int multiplicacion(int numero1,int numero2) {
        int mult=0;
        mult=numero1*numero2;
        return mult;
    }
    public void lista(int x) {
         for (int i = 1; i <= x; i = i + 1) {
           System.out.println(i);
  }
    }
}
