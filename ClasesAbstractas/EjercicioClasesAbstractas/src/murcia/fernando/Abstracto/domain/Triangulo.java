package murcia.fernando.Abstracto.domain;

/**
 *
 * @author fernando.murcia
 */
public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    public void dibujar(){
        //Implementacion del metodo dibujar heredado de la clase FiguraGeometrica
        System.out.println("Aqui deberia dibujar un: " + this.getClass().getSimpleName());
    }
    
}
