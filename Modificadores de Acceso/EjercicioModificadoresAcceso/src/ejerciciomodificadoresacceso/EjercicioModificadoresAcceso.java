package ejerciciomodificadoresacceso;

import paqueteA.ClaseB;
import paqueteB.ClaseC;
import paqueteB.ClaseD;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioModificadoresAcceso {

    public static void main(String[] args) {
        
        //Prueba de acceso a ClaseA desde otras clases
        //Acceso a CLaseA desde ClaseB
        System.out.println("*** Acceso desde clase B a Clase A (mismo paquete)***");
        new ClaseB().pruebaDesdeClaseB();
        
        //Acceso clase A desde clase B
        //Clase extiende clase A
        System.out.println("\n***Acceso desde Clase C a Clase A (Diferente paquete pero es subclase)***");
        new ClaseC().pruebaDesdeClaseC();
        
        //Acceso a clase A desde clase D
        //Clase D no es subclase y esta en otro paquete
        System.out.println("\n***Acceso desde clase D a clase A (diferente paquete, no es subclase)***");
        new ClaseD().pruebaDesdeClaseD();
        
    }
    
}
