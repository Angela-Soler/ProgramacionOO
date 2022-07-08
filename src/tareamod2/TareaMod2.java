
package tareamod2;

/**
 *
 * @author user
 */
public class TareaMod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Recursos recursos = new Recursos();
        String msj;
        int mult;
        msj=recursos.mensaje();
        System.out.println(msj);
        msj=recursos.edad(25);
        System.out.println(msj);
        mult=recursos.multiplicacion(6, 2);
        System.out.println(mult);
        recursos.lista(9);
        
        System.out.println(5+2);
    }
    
}
