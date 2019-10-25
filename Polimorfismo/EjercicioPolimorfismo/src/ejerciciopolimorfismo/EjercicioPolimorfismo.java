package ejerciciopolimorfismo;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioPolimorfismo {

    public static void main(String[] args) {
        
        Empleado emp = new Empleado ("Luciana", 1000);
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente("karen", 3000, "Finanzas");
        imprimirDetalles(ger);
    }
    
    public static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
    
}
