package murcia.fernando.Abstracto.domain;

/**
 *
 * @author fernando.murcia
 */
public abstract class FiguraGeometrica {
    
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    // La clase padre no define comportamiento
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "Tipo de Figura: " + this.tipoFigura;
    }
    
    
    
}
