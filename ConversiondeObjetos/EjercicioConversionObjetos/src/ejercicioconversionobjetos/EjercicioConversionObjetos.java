package ejercicioconversionobjetos;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioConversionObjetos {

    public static void main(String[] args) {
        
        // 1 Creamos un tipo de mas alta jerarquia
        Empleado empleado;
        //Asiganamos una referencia de un objeto de menor jerarquia
        //Esto es upcasting, no hay necesidad de una notacion especial
        empleado = new Escritor("karen", 15000, TipoEscritura.CLASICO);
        
        /* Sin embargo si quisieramos acceder  al detalle de la clase escritor
           no es posible, ya que esas caracteristicas no estan en comun entre
           todas las clases de la jerarquia de clases
           emp.getTipoDeEscrituraEnTexto();
        */
        
        //Imprimimos los detalles en un metodo generico
        imprimirDetalles(empleado);
        
        //2. Podemos hacer lo mismo con la clase gerente
        //Esto es upcasting por lo que no requiere una sintaxis especial
        empleado = new Gerente("Luciana", 18000, "Sistemas");
        
        /*pero si queremos acceder directo por la variable empleado
          al detalle del objeto gerente no es posible, se pierde el acceso
          empleado.getDepartamento();
        */
        
        //Utilizamos el mismo metodo para imprimir los detalles
        imprimirDetalles(empleado);
        
       
    }

    private static void imprimirDetalles(Empleado empleado) {
        
        String resultado = null;
        
        //Imprimir detalles es general para todos ya que es por polimorfismo
        //No se nececita de ninguna conversion
        System.out.println("\nDetalle: "+ empleado.obtenerDetalles());
        
        //Pero los detalles de cada clase debemos hacer un downcasting
        if (empleado instanceof Escritor) {
            //Convertimos el objeto  al tipo inferior deseado
            //Convierte objeto downcasting
            Escritor escritor = (Escritor) empleado;
            //Finalmente podemos acceder a los metodos de la clase Escritor
            resultado = escritor.getTipoDeEscrituraEnTexto();
            
            //Otra forma de hacer la conversion en la misma linea de codigo.
            //Esto es muy común encontrarlo en Java
            //Para evitar la creacion de variables innecesarias
            resultado = ((Escritor) empleado).tipoEscritura.getDescripcion();
            
            System.out.println("Resultado tipoEscritura: "+ resultado);
            
        }else if (empleado instanceof Gerente) {
            //hacemos el downcasting en ka misma linea de codigo
            //nos ahorramos una variable
            resultado = ((Gerente) empleado).getDepartamento();
            System.out.println("resultado departamento: " + resultado);
            
        }
    }
    
}
