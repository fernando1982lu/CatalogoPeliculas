package ejercicioconversionobjetos;

/**
 *
 * @author fernando.murcia
 */
public enum TipoEscritura {
    
    CLASICO("ESCRITURA A MANO"),
    MODERNO("ESCRITURA DIGITAL");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        
        this.descripcion = descripcion;
    }

 
    public String getDescripcion() {
        return descripcion;
    }

}
