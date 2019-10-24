package varargs;

/**
 *
 * @author fernando.murcia
 */
public class VarArgs {

    public static void main(String[] args) {
        // Imprimir varios numeros
        imprimirNumeros(10, 5, 67, 34, 12, 45, 27);
        
        System.out.println("");
        imprimirNumerosForEach(10, 5, 67, 34, 12, 45, 27);
        
        System.out.println("");
        variosParametros("Luciana", true, 15, 8, 18);
    }
    
    // Parametro que recibe argumentos variables.
    public static void imprimirNumeros(int... numeros){
        
        //Recorremos cada elemento
        int elemento;
        for (int i = 0; i < numeros.length; i++) {
            
            elemento = numeros[i];
            System.out.println("Elemento: " + i + ": " + elemento);
        }
    }
    
    public static void imprimirNumerosForEach(int... numeros){
        // Usamos un ForEach en lugar de un for normal
        for(int numero : numeros){
            System.out.println("El número es: " + numero);
        }
    }
    
    // El argumento variable siempre debe ir de ultimo!...
    public static void variosParametros(String nombre, boolean valido, int... numeros){
        
        System.out.println("Nombre: " + nombre);
        
        System.out.println("Valido: " + valido);
        
        // Usamos un fordEach
        for(int numero : numeros){
            System.out.println("El número es: " + numero);
        }
        
    }
}
