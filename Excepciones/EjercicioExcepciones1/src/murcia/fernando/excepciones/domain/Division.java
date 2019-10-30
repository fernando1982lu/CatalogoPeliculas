package murcia.fernando.excepciones.domain;

/**
 *
 * @author fernando.murcia
 */
public class Division {
    
    //Atributo de la clase
    private int numerador;
    //Atributo de la clase
    private int denominador;
    
    public Division(int numerador, int denominador) throws OperationException{
        if (denominador == 0) {
            
            throw new OperationException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void vizualizarOperacion(){
        System.out.println("El resultado de la division es: " + numerador / denominador);
    }
    
}
