package ejerciciobloquescodigo;

/**
 *
 * @author fernando.murcia
 */
public class Persona {
    
    private int idPersona;
    private static int contadorPersonas;
    
    //Bloque de iniciacion estatico
    static{
        //Iniciamos el idpersonas desde el valor de 10
        contadorPersonas = 10;
        //aqui no se pueden usar variables no staticas
        //idPersona = 1
        System.out.println("Ejecuta bloque estático");
    }
    //bloque de codigo para inicializar atributos de la clase
    //El bloque se copia a cada constructor de la clase
    {
        System.out.println("Ejecuta bloque inicializador");
        setIdPersona(++contadorPersonas);
    }
    
    Persona(){
        System.out.println("Ejecuta constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
}
