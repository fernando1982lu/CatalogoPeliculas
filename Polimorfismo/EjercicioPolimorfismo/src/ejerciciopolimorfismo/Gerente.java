package ejerciciopolimorfismo;

/**
 *
 * @author fernando.murcia
 */
public class Gerente extends Empleado{
    
     private String departamento;
    
    public Gerente (String nombre, double sueldo, String departamento){
        
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //Sobreescribimos el metodo padre heredado
    public String obtenerDetalles(){
        //Observar como accedemos directamente a el atributo heredado
        //debido a que se declaro como protected en la clase padre
        //y ppor tanto la clase hija lo hereda y lo accede directamente
        return super.obtenerDetalles() + ", departamento: " + departamento;
    }

    
    public String getDepartamento() {
        return departamento;
    }

    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
