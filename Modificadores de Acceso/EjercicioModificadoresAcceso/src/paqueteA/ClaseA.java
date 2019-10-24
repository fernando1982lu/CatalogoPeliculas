package paqueteA;

/**
 *
 * @author fernando.murcia
 */
public class ClaseA {
    
    //Definicion de atributos
    public int atrPublico = 5;
    protected int atrProtegido = 6;
    int atrPaquete = 7;
    private int atrPrivado = 8;
    
    //Constructores
    
    public ClaseA(){
        
    }
    
    public ClaseA(int i){
        System.out.println("Constructor publico 1");
    }
    
    public ClaseA(int i, int j){
        System.out.println("Constructor protected 2");
    }
    
    public ClaseA(int i, int j, int k){
        System.out.println("Constructor package 3");
    }
    
    public ClaseA(int i, int j, int k, int l){
        System.out.println("Constructor privado 4");
    }
    
    //Definicion de métodos
    public int metodoPublico(){
        return 9;
    }
    
    public int metodoProtegido(){
        return 10;
    }
    
    int metodoPaquete(){
        return 11;
    }
    
    private int metodoprivado(){
        return 12;
    }
}
