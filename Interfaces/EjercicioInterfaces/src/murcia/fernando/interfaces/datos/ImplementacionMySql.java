package murcia.fernando.interfaces.datos;

/**
 *
 * @author fernando.murcia
 */
public abstract class ImplementacionMySql implements AccesoDatos{
    
    @Override
    public void insetar() {
        System.out.println("Insertar desde Oracle");
    }
    
    @Override
    public void listar(){
        System.out.println("Listar desde MySql");
    }
    
}
