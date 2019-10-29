package ejerciciojavabeans;

import murcia.fernando.beans.PersonaBean;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioJavaBeans {

    public static void main(String[] args) {
        
        PersonaBean bean = new PersonaBean();
        bean.setNombre("Luciana");
        bean.setEdad(1);
        
        System.out.println("Nombre: " + bean.getNombre());
        System.out.println("Edad: " + bean.getEdad());
    }
    
}
