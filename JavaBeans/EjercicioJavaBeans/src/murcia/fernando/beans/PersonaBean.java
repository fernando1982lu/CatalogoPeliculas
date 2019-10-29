package murcia.fernando.beans;

import java.io.Serializable;
/**
 *
 * @author fernando.murcia
 */

// 1. Implementa la interface serializable del paquete java.io
public class PersonaBean implements Serializable {
    
    // 2. cada propiedad es de tipo private
    private String nombre;
    private int edad;
    // 3. Siempre tiene un constructor sin argumentos
    
   public PersonaBean(){
   }
   // Constructor del JavaBean (no requerido)
   public PersonaBean(String nombre, int edad){
       this.nombre = nombre;
       this.edad = edad;
   }
   //4. Por cada propiedad agrega un set y un get
   // o solo alguno de ellos 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
}
