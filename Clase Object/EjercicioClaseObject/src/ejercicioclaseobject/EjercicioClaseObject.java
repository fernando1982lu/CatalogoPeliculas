package ejercicioclaseobject;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioClaseObject {

    public static void main(String[] args) {
        
        Empleado emp1 = new Empleado("karen", 10000);
        Empleado emp2 = new Empleado("karen", 10000);
        
        compararObjetos(emp1, emp2);
    }
    
     private static void compararObjetos(Empleado emp1, Empleado emp2){
         //Llamada a metodo toString
         //Por default se manda llamar el metodo toString dentro del println
         System.out.println("Contenido objeto: " + emp1);
         
         //Revision por referencia
         if (emp1 == emp2) 
             System.out.println("Los objetos tienen misma direccion de memoria");
         else
             System.out.println("Los objetos tienen distinta direccion de memoria");
         
        //Revision por metodo equals
         if (emp1.equals(emp2))
             System.out.println("Los objetos tienen el mismo contenido, son iguales");
         else
             System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
         
         //Revisamos el metodo hashCode
         if(emp1.hashCode() == emp2.hashCode())
             System.out.println("Los objetos tienen el mismo codigo hash");
         else
             System.out.println("Los objetos no tienen el mismo codigo hash");
             
         
       
             
         
     }
}
