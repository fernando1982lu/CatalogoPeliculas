package ejerciciointerfaces;

import murcia.fernando.interfaces.datos.AccesoDatos;
import murcia.fernando.interfaces.datos.ImplementacionMySql;
import murcia.fernando.interfaces.datos.ImplementacionOracle;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioInterfaces {

    public static void main(String[] args) {
        
        AccesoDatos datos = new ImplementacionOracle();
        ejecutar(datos, "listar");
        
        datos = new ImplementacionMySql() {};
        ejecutar(datos, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        
        if("listar".equals(accion)){
            datos.listar();
        }
        else if("insertar".equals(accion)){
            datos.insetar();
        }
    }
    
}
