package murcia.fernando.datos;

import murcia.fernando.excepciones.AccesoDatosEx;

/**
 *
 * @author fernando.murcia
 */
public interface AccesoDatos {
    
    public abstract void insertar() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    public abstract void simularError(boolean simularError);
    
    
}
