package murcia.fernando.peliculas.negocio;

import java.util.List;
import murcia.fernando.peliculas.datos.AccesoDatos;
import murcia.fernando.peliculas.datos.AccesoDatosImpl;
import murcia.fernando.peliculas.domain.Pelicula;
import murcia.fernando.peliculas.excepciones.AccesoDatosEX;
import murcia.fernando.peliculas.excepciones.LecturaDatosEx;

/**
 * Administrador del catalogo de peliculas
 * @author fernando.murcia
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        } catch (AccesoDatosEX ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            for (Pelicula pelicula : peliculas) {
                System.out.println("Pelicula:" + pelicula);
            }
        } catch (AccesoDatosEX ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(buscar, nombreArchivo);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
            ex.printStackTrace();
        }
        System.out.println("Resultado busqueda:" + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEX ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
    }
    
}
