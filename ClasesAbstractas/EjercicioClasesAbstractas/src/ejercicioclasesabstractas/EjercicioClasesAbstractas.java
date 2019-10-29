
package ejercicioclasesabstractas;

import murcia.fernando.Abstracto.domain.Circulo;
import murcia.fernando.Abstracto.domain.FiguraGeometrica;
import murcia.fernando.Abstracto.domain.Rectangulo;
import murcia.fernando.Abstracto.domain.Triangulo;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioClasesAbstractas {

    public static void main(String[] args) {
        //Creacion de Objetos
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();
    }
    
}
