package ejercicioexcepciones1;

import murcia.fernando.excepciones.domain.Division;
import murcia.fernando.excepciones.domain.OperationException;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioExcepciones1 {

    public static void main(String[] args) {
        
        try{
            Division division = new Division (10, 0);
            division.vizualizarOperacion();
        }catch(OperationException oe){
            System.out.println("Ocurrio un error!!!");
            oe.printStackTrace();         
        }
    }
    
}
