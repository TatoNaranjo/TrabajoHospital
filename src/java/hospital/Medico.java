
package hospital;

public class Medico extends ClasePadre {
    String id;

    public Medico(String id, String nombre, String apellido, String sexo) {
        super(nombre, apellido, sexo);
        this.id = id;
    }
    
}