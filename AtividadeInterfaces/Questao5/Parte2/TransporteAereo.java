public abstract class TransporteAereo extends Transporte{
    protected int altitudeAtual;

    public void subirMetros(int metros){
        this.altitudeAtual += metros;
    }
    public void descerMetros(int metros){
        this.altitudeAtual -= metros;
    }
}
