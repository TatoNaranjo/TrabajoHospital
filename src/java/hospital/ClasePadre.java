
package hospital;

public class ClasePadre {

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
    private String nombre;
    private String apellido;
    private String sexo;

    public ClasePadre(String nombre, String apellido, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public ClasePadre() {
    }
    
    
}
