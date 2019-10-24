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
    
    continentes(int paises){
        this.setPaises(paises);
    }

    /**
     * @return the paises
     */
    public int getPaises() {
        return paises;
    }

    /**
     * @param paises the paises to set
     */
    public void setPaises(int paises) {
        this.paises = paises;
    }
    
    
            
    
}
