package ejercicioconversionobjetos;

/**
 *
 * @author fernando.murcia
 */
public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo padre heredado
    public String ObtenerDetalles(){
        
        /*Observamos que para no repetir codigo, podemos utilizar el metodo
          del padre y solo agregar a este metodo de la clase hija.
         * Esto es invocar un metodo sobrescrito
        */
        return super.obtenerDetalles() + ", Departamento: " + getDepartamento();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
