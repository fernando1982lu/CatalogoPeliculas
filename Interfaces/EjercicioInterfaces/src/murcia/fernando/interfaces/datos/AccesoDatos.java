package murcia.fernando.interfaces.datos;

/**
 *
 * @author fernando.murcia
 */
public interface AccesoDatos {
    
    public static int MAX_REGISTROS = 10;
    
    public abstract void insetar();
    
    public abstract void listar();
    
    
}
