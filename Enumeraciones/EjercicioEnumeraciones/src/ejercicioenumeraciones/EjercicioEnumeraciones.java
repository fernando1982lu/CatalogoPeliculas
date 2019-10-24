package ejercicioenumeraciones;

/**
 *
 * @author fernando.murcia
 */
public class EjercicioEnumeraciones {

    public static void main(String[] args) {
        
        // valores de la enumeracion.
        System.out.println("Valor 1: " + Dias.LUNES);
        
        //Hacemos un test del dia utilizado.
        
        indicarDia(Dias.VIERNES);
        
        // Utilizamos la enumeracion de paises
        System.out.println("Continente N° 4: " + Continentes.AMERICA);
        System.out.println("Paises de America: " + Continentes.AMERICA.getPaises());
        
        //Hacemos un test del número de paises por continente
        System.out.println("");
        imprimirContinentes();
    }
    
    public static void indicarDia(Dias dias){
        switch (dias){
            // Se puede usar algun valor constante de la enumeracion directamente
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIRCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Ese ya no es dia de la semana ");
        }
    }
    
    public static void indicarPaises(Continentes continentes){
        
        switch (continentes){
            //Se puede usar un valor constante de la enumeracion directa
            case AFRICA:
                System.out.println("N° Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            case EUROPA:
                System.out.println("N° Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            case ASIA:
                System.out.println("N° Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            case AMERICA:
                System.out.println("N° Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            case OCEANIA:
                System.out.println("N° Paises en: " + continentes + ": " + continentes.getPaises());
                break;
            default:
                System.out.println("Ese no es continente");
        }
    }
    public static void imprimirContinentes(){
        // Utilizamos un ForEach
        for(Continentes c: Continentes.values()){
            System.out.println("Continente: " + c + " continente " + c.getPaises() + "paises.");
        }
    }
    
}
