
package tareamod3;

/**
 *
 * @author user
 */
public class TareaMod3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creando el objeto persona 
    Mecanico mecanico = new Mecanico();
    mecanico.setNombre("Manuel");
    mecanico.setApellido("Castro");
    mecanico.setEdad (30);
    mecanico.setSexo ("M");
    mecanico.setTipoEquipo ("Equipo Liviano");
     mecanico.setMantenimiento ("Preventivo");
     mecanico.setExperiencia ("5 años");
System.out.println("Nombre: " + mecanico.getNombre() );
System.out.println("apellido: " + mecanico.getApellido() );
System.out.println("Edad: " + mecanico.getEdad() );
System.out.println("Sexo: " + mecanico.getSexo() );
System.out.println("Tipo Equipo: " + mecanico.getTipo() );
System.out.println("Mantenimiento: " + mecanico.getMantenimiento() );
System.out.println("Experiencia: " + mecanico.getExperiencia() );
    }
    
}
