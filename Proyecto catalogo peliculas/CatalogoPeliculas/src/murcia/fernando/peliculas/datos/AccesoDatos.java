package murcia.fernando.peliculas.datos;

import java.util.List;
import murcia.fernando.peliculas.domain.Pelicula;
import murcia.fernando.peliculas.excepciones.EscrituraDatosEx;
import murcia.fernando.peliculas.excepciones.LecturaDatosEx;
import murcia.fernando.peliculas.excepciones.AccesoDatosEX;


/**
 *
 * @author fernando.murcia
 */
public interface AccesoDatos {   
    
    boolean existe(String nombreArchivo) throws AccesoDatosEX;
    
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx ;
            
    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
            
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
     public void crear(String nombreArchivo) throws AccesoDatosEX;

    public void borrar(String nombreArchivo) throws AccesoDatosEX;
}
