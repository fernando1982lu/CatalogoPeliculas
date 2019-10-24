package ejercicioautoboxininboxin;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioAutoboxinInboxin {

    public static void main(String[] args) {
        
        //Autoboxing (se convierten de tipos primitivos a tipos Object)
        Integer enteroObj = 10;
        Float flotanteObj = 15.2F;
        Double dobleObj = 40.1;
        System.out.println("Autobixing");
        System.out.println("Entero Obj: " + enteroObj.intValue());
        System.out.println("Flotante Obj: " + flotanteObj.floatValue());
        System.out.println("Double Obj: " + dobleObj.doubleValue());
        
        //Autoboxing (se convierte de objetos a tipos primitivos)
        
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("\nUnboxing");
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        System.out.println("Double: " + doble);
    }
    
}
