package ejercicioenumeraciones;
/**
 *
 * @author fernando.murcia
 */
public enum Continentes {
    
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private  int paises;
    
    Continentes(int paises){
        this.setPaises(paises);
    }

    public int getPaises() {
        return paises;
    }

    public void setPaises(int paises) {
        this.paises = paises;
    }
    
}
