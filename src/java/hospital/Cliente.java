
package hospital;
public class Cliente extends ClasePadre {

    /**
     * @return the dirResidencia
     */
    public String getDirResidencia() {
        return dirResidencia;
    }

    /**
     * @param dirResidencia the dirResidencia to set
     */
    public void setDirResidencia(String dirResidencia) {
        this.dirResidencia = dirResidencia;
    }

    /**
     * @return the lugarAtencion
     */
    public String getLugarAtencion() {
        return lugarAtencion;
    }

    /**
     * @param lugarAtencion the lugarAtencion to set
     */
    public void setLugarAtencion(String lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }

    /**
     * @return the motivoConsulta
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * @param motivoConsulta the motivoConsulta to set
     */
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the medicoAtendiendo
     */
    public String getMedicoAtendiendo() {
        return medicoAtendiendo;
    }

    /**
     * @param medicoAtendiendo the medicoAtendiendo to set
     */
    public void setMedicoAtendiendo(String medicoAtendiendo) {
        this.medicoAtendiendo = medicoAtendiendo;
    }
   
    public Cliente(){
    super();
    }
 private String dirResidencia;
    private String lugarAtencion;
    private String motivoConsulta;
    private String fecha;
    private String medicoAtendiendo;
    public Cliente(String nombre, String apellido, String sexo, String dirResidencia, String lugarAtencion, String motivoConsulta,  String medicoAtendiendo,String fecha) {
        super(nombre, apellido, sexo);
        this.dirResidencia = dirResidencia;
        this.lugarAtencion = lugarAtencion;
        this.motivoConsulta = motivoConsulta;
        this.fecha = fecha;
        this.medicoAtendiendo = medicoAtendiendo;
    }

   
    
}

