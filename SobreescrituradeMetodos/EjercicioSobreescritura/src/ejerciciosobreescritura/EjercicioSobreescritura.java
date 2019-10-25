package ejerciciosobreescritura;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioSobreescritura {

    public static void main(String[] args) {
        
        Empleado emppleado = new Empleado("Luciana", 2000);
        System.out.println(emppleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Karen", 3000, "Finanzas");
        System.out.println(gerente.obtenerDetalles());
    }
    
}
