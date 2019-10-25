package paqueteB;
import paqueteA.ClaseA;

/**
 *
 * @author fernando.murcia
 */
public class ClaseD {
    
    public ClaseD(){
        /*Constructor protegido, restringido al no ser una subclase
          super(1, 2)
          acceswo package, y al estar fuera del paquete esta restringido
          super(1, 2, 3)
          acceso privado, restringido
          super(1, 2, 3, 4)
        */
    }
    
    public void pruebaDesdeClaseD(){
        //Acceso a ClaseA desde ClaseD
        //ClaseD no es subclase y esta en otro paquete
        ClaseA c1 = new ClaseA();
        System.out.println("");
        System.out.println("Atributo publico: " + c1.atrPublico);
        System.out.println("Atributo protegido : No se puede acceder desde un paquete externo al no ser una subclase");
        System.out.println("Atributo default: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo publico: Acceso negado");
        
        // constructor publico
        new ClaseA();
        // Los demas constructores no se pueden probar asi, sino desde el constructor de esta clase
        // Ya que esta es una subclase en otro paquete
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido :No se puede acceder desde un paquete externo al no ser una subclase");
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
    
    }
    
}
