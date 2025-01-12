public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
    private int numeroCilindradas;

    @Override
    public void ligarMotor() {
        
    }

    @Override
    public void abastecer(int numLitros) {      
    }

    public boolean estaParado(){
        if(velocidadeAtual==0){
            return true; 
        }
        return false;
    }

    public void embraiar(){

    }

    @Override
    public void curvar(float angulo) {
        // TODO Auto-generated method stub
        
    }
}
