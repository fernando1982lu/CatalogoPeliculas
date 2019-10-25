package paqueteA;

/**
 *
 * @author fernando.murcia
 */
public class ClaseB {
    
    public ClaseB(){
        //Prueba constructores
        System.out.println("");
        //Constructor publico
        new ClaseA(1);
        //constructor protegido
        new ClaseA(1, 2);
        //Constructor default o package
        new ClaseA(1, 2, 3);
        //Constructor private
        //new ClaseA(1, 2, 3, 4);
        System.out.println("Constructor private: Acceso negado");
    }
    
    public void pruebaDesdeClaseB(){
        //Acceso a claseA desde ClaseB
        ClaseA c1 = new ClaseA();
        System.out.println("");
        System.out.println("Atributo publico: " + c1.atrPublico);
        System.out.println("Atributo protegido: " + c1.atrProtegido);
        System.out.println("Atributo default: " + c1.atrPaquete);
        System.out.println("Atributo private: Acceso negado");
        
        System.out.println("");
        System.out.println("Metodo publico: " + c1.metodoPublico());
        System.out.println("Metodo protegido: " + c1.metodoProtegido());
        System.out.println("Metodo default: " + c1.metodoPaquete());
        System.out.println("Metodo private: Acceso negado");
        
    }
    
}
