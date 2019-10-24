package ejerciciobloquescodigo;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioBloquesCodigo {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        int id = p1.getIdPersona();
        
        Persona p2 = new Persona();
        int cod = p2.getIdPersona();
        System.out.println("Id Persona: " + id);
        System.out.println("Cod Persona: " + cod);
    }
    
}
