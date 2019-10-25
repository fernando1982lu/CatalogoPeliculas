package ejercicioinstanceof;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioInstanceOf {

    
    public static void main(String[] args) {
        
        FiguraGeometrica figura;
        figura = new Elipse();
        //Determina solo un tipo el que corresponda con la jerarquia
        determinaTipo(figura);
        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos");
        determinaTodosLosTipos(figura);
    }
    
    private static void determinaTodosLosTipos(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }
        if (figura instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        }
        if (figura instanceof FiguraGeometrica) {
            //Procesa algo particular de la figura Geometrica
            System.out.println("Es una figura geometrica");          
        }
        if (figura instanceof Object) {
            //Procesa algo particular de la clase object
            System.out.println("Es un object");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
    
    private static void determinaTipo(FiguraGeometrica figura){
        if (figura instanceof Elipse) {
            //Procesa algo particular de la Elipse
            System.out.println("Es una Elipse");
        }else if (figura instanceof Circulo) {
            //Procesa algo particular del Circulo
            System.out.println("Es un Circulo");
        }else if (figura instanceof FiguraGeometrica) {
            // Procesa algo particular de la figuraGeometrica
            System.out.println("Es una Figura Geometrica");
        }else if (figura instanceof Object) {
            //Procesa algo particular de la clase object
            System.out.println("Es un Object");
        }else{
            System.out.println("No se encontro el tipo");
        }
    }
    
}
