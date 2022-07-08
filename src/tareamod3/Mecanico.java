
package tareamod3;

/**
 *
 * @author user
 */
public class Mecanico {
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo; 
    private String tipo;
    private String mantenimiento; 
    private String experiencia;
    
//Métodos públicos para acceder a los datos
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public String getTipo(){
        return tipo;
    }
    public String getMantenimiento(){
        return mantenimiento;
    }
     public String getExperiencia(){
        return experiencia;
    }
    
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setTipoEquipo(String tipo){
        this.tipo = tipo;
    }
    public void setMantenimiento(String mantenimiento){
        this.mantenimiento = mantenimiento;
    }
     public void setExperiencia(String experiencia){
        this.experiencia = experiencia;
    }
 }