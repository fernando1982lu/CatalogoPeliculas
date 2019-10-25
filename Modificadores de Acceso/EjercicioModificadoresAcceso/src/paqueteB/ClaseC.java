package paqueteB;
import paqueteA.ClaseA;
/**
 *
 * @author fernando.murcia
 */
public class ClaseC extends ClaseA{
    
    public ClaseC(){
        //Constructor protegido, al ser una suclase puede acceder
        // aunque este en otro paquete
        super(1, 2);
        //acceso package, y al estar fuera de paquete esta restringido
        //super (1, 2, 3);
        //Acceso privado, restringido
        //super(1,2,3,4)
    }
    
    public void pruebaDesdeClaseC(){
        //Acceso a ClaseA desde ClaseB
        //ClaseC extiende de ClaseA
        ClaseA c1 = new ClaseA();
        System.out.println("");
        System.out.println("Atributo publico: " + c1.atrPublico + " o heredado: " + atrPublico);
        System.out.println("Atributo protegido (heredado): " + atrProtegido);
        System.out.println("Atributo default: No se puede acceder desde un paquete externo" );
        System.out.println("Atributo publico: Acceso negado");
        
        // constructor publico
        new ClaseA();
        // Los demas constructores no se pueden probar asi, sino desde el constructor de esta clase
        // Ya que esta es una subclase en otro paquete
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido (heredado): " + metodoPublico());
        System.out.println("Metodo default: No se puede acceder desde un paquete externo");
        System.out.println("Metodo private: Acceso negado");
    }
    
}
