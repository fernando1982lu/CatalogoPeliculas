package ejercicioforeach;

/**
 *
 * @author fernando.murcia
 */
public class Persona {
    
    private final int idPersona;
    private String nombre;
    
    private static int contadorPersonas;
    
    Persona(String nombre){
        idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

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
    
    
    
}
