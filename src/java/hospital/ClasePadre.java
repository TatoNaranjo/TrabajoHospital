
package hospital;

public class ClasePadre {
    //Se Crean las Tres variables generales, que tendría toda persona.
    private String nombre;
    private String apellido;
    private String sexo;

    //Se Encapsulan las Variables
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
//Fin del Encapsulado de Variables.
    
    //Se crea el Constructor sobrecargado de la Clase Padre
    public ClasePadre(String nombre, String apellido, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }
   //Se Crea el Constructor Normal de la Clase Padre
    public ClasePadre() {
    }
    
    
}
