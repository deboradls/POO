public abstract class Transporte {
    private String nome;
    private int numeroPassageiros;
    protected int velocidadeAtual;

    public boolean estaParado(){
        if(this.velocidadeAtual==0){
            return true;
        }
        return false;
    }
}
