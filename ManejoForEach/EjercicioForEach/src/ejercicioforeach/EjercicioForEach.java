package ejercicioforeach;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioForEach {

    public static void main(String[] args) {
        
        // creamos un arreglo de personas
        Persona[] personas = {new Persona("Luciana"), new Persona("Karen")};
        
        // Iteramos cada elemento del arreglo de personas 
        for(Persona p : personas){
            //Accedemos a las propiedades y/o metodos del objeto
            String nombre = p.getNombre();
            System.out.println("Nombre persona: " + nombre);
        }
        
        System.out.println("");
        //Creamos un arreglo de enteros
        int[] edades = {2, 29, 37, 16};
        //Iteramos el arreglo
        for(int edad : edades){
            System.out.println("Edad: " + edad);
        }    
    }
}
