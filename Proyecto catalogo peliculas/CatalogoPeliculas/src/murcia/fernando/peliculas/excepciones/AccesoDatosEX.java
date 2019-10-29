package murcia.fernando.peliculas.excepciones;

/**
 *
 * @author fernando.murcia
 */
public class AccesoDatosEX extends Exception{
    
    String mensaje;
    
    public AccesoDatosEX(String mensaje){
        
        this.mensaje = mensaje;
    }
    
}
